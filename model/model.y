%define parse.error verbose

%{
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "model.h"

extern int yylineno;

int yylex(void);
void yyerror(const char *s);

Model_t *model;

char* listBuffer[nOperationalLimitations]; // max enough to hold both types
int currentListIndex = 0;

enum { NONE, SENSOR_LIST, LIMITATION_LIST } currentListType = NONE;

void printModel(const Model_t *model) {
    if (!model) {
        printf("Model is NULL\n");
        return;
    }

    printf("\n\n=== Model ===\n");
    printf("Name: %s\n", model->name);
    printf("Cargo Capacity: %d\n", model->cargoCapacity);
    printf("Autonomy: %d\n", model->autonomy);
    printf("Cruising Velocity: %d\n", model->crusingVelocity);
    printf("Lifting Velocity: %d\n", model->liftingVelocity);
    printf("Landing Velocity: %d\n", model->landingVelocity);

    printf("Sensors:\n");
    for (int i = 0; i < maxSensorsNumber; i++) {
        if (model->sensors[i] != NULL && model->sensors[i][0] != '\0') {
            printf("  - %s\n", model->sensors[i]);
        }
    }

    printf("Operational Limitations:\n");
    for (int i = 0; i < nOperationalLimitations; i++) {
        if (model->operationalLimitations[i][0] != '\0') {
            printf("  - %s\n", model->operationalLimitations[i]);
        }
    }
}


%}



%union {
    int ival;
    char* sval;
}

%token MODEL NM CC AT VC VS VD SS LO
%token ':' ';' ',' '{' '}' '[' ']'

%token <ival> NUMBER
%token <sval> ALPHANUMERIC
%token <sval> STRING

%%

body: 
    body structure
    | structure
    ;

structure:
    MODEL ':' '{' structureBody '}' {
        //printf("Model structure created\n");
        printModel(model);
    }
    ;

structureBody: 
    structureBody keyValuePair ';'  {}
    | keyValuePair ';' {}

keyValuePair:
    NM ':' ALPHANUMERIC {
        model->name = strdup($3);
    }
    | CC ':' NUMBER {
        model->cargoCapacity = $3;
    }
    | AT ':' NUMBER {
        model->autonomy = $3;
    }
    | VC ':' NUMBER {
        model->crusingVelocity = $3;
    }
    | VS ':' NUMBER {
        model->liftingVelocity = $3;
    }
    | VD ':' NUMBER {
        model->landingVelocity = $3;
    }
    | SS ':' LIST {
        currentListType = SENSOR_LIST;
        for (int i = 0; i < currentListIndex && i < maxSensorsNumber; i++) {
            model->sensors[i] = strdup(listBuffer[i]);
        }
        // Optional: null out remaining
        for (int i = currentListIndex; i < maxSensorsNumber; i++) {
            model->sensors[i] = NULL;
        }
        currentListIndex = 0;
        currentListType = NONE;
    }
    | LO ':' LIST {
        currentListType = LIMITATION_LIST;
        for (int i = 0; i < currentListIndex && i < nOperationalLimitations; i++) {
            strncpy(model->operationalLimitations[i], listBuffer[i], operationalLimitationSize);
            model->operationalLimitations[i][operationalLimitationSize - 1] = '\0'; // ensure null-termination
        }
        currentListIndex = 0;
        currentListType = NONE;
    }
    ;

LIST:
    '[' LISTBODY ']' {
        //printf("List created with %d items\n", currentListIndex);
    }
    ;

LISTBODY:
    LISTBODY ',' VALUE
    | VALUE
    ;

VALUE:
    ALPHANUMERIC {
        if (currentListIndex < nOperationalLimitations) {
            listBuffer[currentListIndex++] = strdup($1);
        }
    }
    | STRING {
        if (currentListIndex < nOperationalLimitations) {
            listBuffer[currentListIndex++] = strdup($1);
        }
    }
    ;


%%

int main() {
    model = (Model_t *) malloc(sizeof(Model_t));;
    return yyparse();
}

void yyerror(const char *msg) {
    fprintf(stderr, "Syntax error on line %d: %s\n", yylineno, msg);
}