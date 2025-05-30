%{
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

void yyerror(const char *s);
int yylex(void);

char* current_sn = NULL;
int erro_ja_impresso = 0;

void print_drone_invalido(const char* campo, const char* motivo) {
    if (erro_ja_impresso) return;
    erro_ja_impresso = 1;
    printf("\n---- Drone Inválido ----\n");
    printf("Serial Number: %s\n", current_sn ? current_sn : "(desconhecido)");
    printf("Campo: %s\n", campo);
    printf("Motivo: %s\n", motivo);
}

struct Drone {
    char* numero_serie;
    int tempo_voo;
    char* modelo;
    char* estado;
    char* restricoes[20];
    int restricoes_count;

    int has_sn;
    int has_tv;
    int has_md;
    int has_ea;
} drone;
%}

%union {
    char* sval;
    int ival;
}

%token DRONE SN TV MD RT EA
%token <sval> IDENT STRING
%token <ival> NUMBER
%token ':' ';' ',' '[' ']'

%start input

%define parse.error verbose

%%

input:
      /* vazio */
    | input drone
    | input error {
        print_drone_invalido("Geral", "Erro inesperado no ficheiro");
        yyerrok;
        yyclearin;
    }
    ;

drone:
      DRONE ':' '{' {
            current_sn = NULL;
            erro_ja_impresso = 0;
            drone.numero_serie = NULL;
            drone.modelo = NULL;
            drone.estado = NULL;
            drone.tempo_voo = 0;
            drone.restricoes_count = 0;
            drone.has_sn = 0;
            drone.has_tv = 0;
            drone.has_md = 0;
            drone.has_ea = 0;
        } atributos '}' {
            if (!drone.has_sn) {
                print_drone_invalido("Número de série", "Campo obrigatório não foi definido");
            } else if (!drone.has_tv) {
                print_drone_invalido("Tempo de voo", "Campo obrigatório não foi definido");
            } else if (!drone.has_md) {
                print_drone_invalido("Modelo", "Campo obrigatório não foi definido");
            } else if (!drone.has_ea) {
                print_drone_invalido("Estado", "Campo obrigatório não foi definido");
            } else {
                printf("\n--- DRONE VÁLIDO ---\n");
                printf("Número de Série: %s\n", drone.numero_serie);
                printf("Tempo de Voo: %d minutos\n", drone.tempo_voo);
                printf("Modelo: %s\n", drone.modelo);
                printf("Estado: %s\n", drone.estado);

                printf("Restrições:\n");
                if (drone.restricoes_count == 0) {
                    printf("  Sem restrições\n");
                } else {
                    for (int i = 0; i < drone.restricoes_count; i++) {
                        printf("  - %s\n", drone.restricoes[i]);
                    }
                }
            }
        }
    | DRONE ':' '{' error '}' {
            print_drone_invalido("Estrutura do drone", "Erro de sintaxe dentro do bloco do drone");
            yyerrok;
            yyclearin;
        }
    | DRONE ':' error {
            print_drone_invalido("Bloco de abertura", "Esperado '{' após 'drone:'");
            yyerrok;
            yyclearin;
        }
    ;

atributos:
      atributo
    | atributos atributo
    | atributos error {
        print_drone_invalido("Atributo", "Erro de sintaxe no atributo");
        yyerrok;
        yyclearin;
    }
    ;

atributo:
      SN ':' IDENT ';' {
            current_sn = $3;
            if (strlen($3) != 10) {
                print_drone_invalido("Número de série", "Esperado: L-XXXXXXXXX (10 caracteres)");
                YYERROR; yyerrok;
            } else if (!isupper($3[0]) || $3[1] != '-') {
                print_drone_invalido("Número de série", "Deve começar com letra maiúscula seguida de hífen");
                YYERROR; yyerrok;
            } else {
                int valido = 1;
                for (int i = 2; i < 10; i++) {
                    if (!isalnum($3[i])) {
                        valido = 0;
                        break;
                    }
                }
                if (!valido) {
                    print_drone_invalido("Número de série", "Caracteres após o hífen devem ser alfanuméricos");
                    YYERROR; yyerrok;
                } else {
                    drone.numero_serie = $3;
                    drone.has_sn = 1;
                }
            }
        }
    | TV ':' NUMBER ';' {
            if ($3 < 0) {
                print_drone_invalido("Tempo de voo", "Deve ser maior ou igual a 0");
                YYERROR; yyerrok;
            } else {
                drone.tempo_voo = $3;
                drone.has_tv = 1;
            }
        }
    | MD ':' IDENT ';' {
            char letras[3];
            int numero;
            if (sscanf($3, "%2[A-Z]-%3d", letras, &numero) != 2) {
                print_drone_invalido("Modelo", "Formato inválido. Esperado: FX-001");
                YYERROR; yyerrok;
            } else {
                drone.modelo = $3;
                drone.has_md = 1;
            }
        }
    | RT ':' '[' string_list ']' ';'
    | EA ':' IDENT ';' {
            if (
                strcmp($3, "FLYN") != 0 &&
                strcmp($3, "IDLE") != 0 &&
                strcmp($3, "CHRG") != 0 &&
                strcmp($3, "MNTC") != 0 &&
                strcmp($3, "UNAV") != 0
            ) {
                print_drone_invalido("Estado", "Deve ser FLYN, IDLE, CHRG, MNTC ou UNAV");
                YYERROR; yyerrok;
            } else {
                drone.estado = $3;
                drone.has_ea = 1;
            }
        }
    ;

string_list:
      STRING {
            drone.restricoes[0] = $1;
            drone.restricoes_count = 1;
        }
    | string_list ',' STRING {
            if (drone.restricoes_count < 20) {
                drone.restricoes[drone.restricoes_count++] = $3;
            }
        }
    | string_list ',' error {
            print_drone_invalido("Lista de restrições", "Apenas strings são permitidas nas restrições");
            yyerrok;
        }
    ;

%%

void yyerror(const char *s) {
    if (!erro_ja_impresso) {
        fprintf(stderr, "Erro inesperado: %s\n", s);
    }
}
