#include <stdio.h>

int main() {
    int opcao;
    char nome_ficheiro[100];
    FILE* ficheiro;

    printf("╔════════════════════════════════════════════════════════════════════╗\n");
    printf("║                     SISTEMA DE GESTÃO DE DRONES                    ║\n");
    printf("╠════════════════════════════════════════════════════════════════════╣\n");
    printf("║ Exemplo de estrutura                                               ║\n");
    printf("║                                                                    ║\n");
    printf("║   drone:{                                                          ║\n");
    printf("║     SN: <Número de Série>;                                         ║\n");
    printf("║     TV: <Tempo de Voo>;                                            ║\n");
    printf("║     MD: <Modelo>;                                                  ║\n");
    printf("║     RT: [\"restrição1\", \"restrição2\"];                          ║\n");
    printf("║     EA: <Estado>;                                                  ║\n");
    printf("║   }                                                                ║\n");
    printf("║                                                                    ║\n");
    printf("╟────────────────────────────────────────────────────────────────────╢\n");
    printf("║ Dicas                                                              ║\n");
    printf("║                                                                    ║\n");
    printf("║ • Comece um drone com: drone:{                                     ║\n");
    printf("║ • Termine com: }                                                   ║\n");
    printf("║ • Se ocorrer erro, recomece com drone:{                            ║\n");
    printf("╚════════════════════════════════════════════════════════════════════╝\n\n");

    printf(" Escolha uma opção:\n");
    printf("  1 - Inserir drones manualmente\n");
    printf("  2 - Carregar drones de um ficheiro\n");
    printf("Opção: ");
    scanf("%d", &opcao);
    getchar();

    if (opcao == 1) {
        printf("\n⌨ Insere os dados dos drones abaixo:\n\n");
        yyparse();
    } else if (opcao == 2) {
        printf("  Nome do ficheiro (ex: drone_example.txt): ");
        fgets(nome_ficheiro, sizeof(nome_ficheiro), stdin);
        nome_ficheiro[strcspn(nome_ficheiro, "\n")] = '\0';

        ficheiro = fopen(nome_ficheiro, "r");
        if (!ficheiro) {
            perror("Erro ao abrir o ficheiro");
            return 1;
        }

        extern FILE* yyin;
        yyin = ficheiro;


        yyparse();

        fclose(ficheiro);
    } else {
        printf(" Opção inválida. Terminar programa.\n");
    }

    return 0;
}
