%{
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "mission.h"
#include "point.h"

Mission_t *mission;

void yyerror(const char* s) {
    fprintf(stderr, "Erro: %s\n", s);
}
int yylex();

void printMission(const Mission_t *mission) {
    if (!mission) {
        printf("Mission is NULL\n");
        return;
    }

    printf("\n=== Mission ===\n");
    printf("Starting Date: %s\n", mission->startDate);
    printf("Model: %s\n", mission->model);
    printf("Starting Point: (%d, %d, %d)\n",
           mission->startPoint.x,
           mission->startPoint.y,
           mission->startPoint.z);

    printf("Route:\n");
    for (int i = 0; i < mission->deliveryCount; i++) {
        printf("Point %d: (%d, %d, %d)\n", i + 1,
               mission->deliveries[i].x,
               mission->deliveries[i].y,
               mission->deliveries[i].z);
    }
}

%}

%union {
    int ival;
    char* sval;
    Point_t point;
}

// Tokens e tipos
%token <sval> DATE MODEL
%token <ival> NUMBER
%token MISSION STT MD STP DELIVERIES P
%token ':' ',' ';' '{' '}' '(' ')'
%type <point> point

%%

// Regras da gramática

input:
    MISSION ':' '{' mission_body '}' {
        printMission(mission);
    }
;

mission_body:
    STT ':' DATE
    MD ':' MODEL ';'
    STP ':' point
    DELIVERIES ':' '{' delivery_list '}' {
        mission->startDate = strdup($3);
        mission->model = strdup($6);
        mission->startPoint = $10;
    }
;

delivery_list:
    delivery_list P ':' point {
        if (mission->deliveryCount < MAX_DELIVERIES) {
            mission->deliveries[mission->deliveryCount++] = $4;
        }
    }
    | P ':' point {
        mission->deliveryCount = 0;
        if (mission->deliveryCount < MAX_DELIVERIES) {
            mission->deliveries[mission->deliveryCount++] = $3;
        }
    }
;

point:
    '(' NUMBER ',' NUMBER ',' NUMBER ')' {
        $$ = (Point_t){ $2, $4, $6 };
    }
;

%%

int main() {
    mission = (Mission_t *)malloc(sizeof(Mission_t));
    return yyparse();
}