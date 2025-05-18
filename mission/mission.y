%code requires {
  #include "point.h"
}

%{
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "mission.h"

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

// Declare the return types of new nonterminals
%type <sval> stt_line md_line
%type <point> stp_line point
%type deliveries_line delivery_list

%%

input:
    MISSION ':' '{' mission_body '}' {
        printMission(mission);
    }
;

mission_body:
    stt_line md_line stp_line deliveries_line {
        mission->startDate = strdup($1);
        mission->model = strdup($2);
        mission->startPoint = $3;
    }
;

stt_line:
    STT ':' DATE ';' { $$ = $3; }
;

md_line:
    MD ':' MODEL ';' { $$ = $3; }
;

stp_line:
    STP ':' point ';' { $$ = $3; }
;

deliveries_line:
    DELIVERIES ':' '{' delivery_list '}' 
;

delivery_list:
    delivery_list P ':' point ';' {
        if (mission->deliveryCount < MAX_DELIVERIES) {
            mission->deliveries[mission->deliveryCount++] = $4;
        }
    }
    | P ':' point ';' {
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
