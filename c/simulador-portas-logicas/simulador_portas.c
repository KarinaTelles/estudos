#include <stdio.h>
int main() {
    int A, B, opcao, resultado;

    do {
        // Entrada dos valores lógicos
        printf("\nDigite o valor de A (0 ou 1): ");
        scanf("%d", &A);
        printf("Digite o valor de B (0 ou 1): ");
        scanf("%d", &B);

        // Menu de operações lógicas
        printf("\nEscolha a operacao logica:\n");
        printf("1 - AND (E)\n");
        printf("2 - OR (OU)\n");
        printf("3 - NAND (NAO-E)\n");
        printf("4 - NOR (NAO-OU)\n");
        printf("5 - XOR (OU-Exclusivo)\n");
        printf("6 - XNOR (Equivalencia)\n");
        printf("7 - NOT A (Inversao de A)\n");
        printf("0 - Sair\n");
        printf("Opcao: ");
        scanf("%d", &opcao);

        // Processa a operação escolhida
        switch (opcao) {
            case 1: resultado = A && B;      printf("Resultado AND: %d\n", resultado); break;
            case 2: resultado = A || B;      printf("Resultado OR: %d\n", resultado); break;
            case 3: resultado = !(A && B);   printf("Resultado NAND: %d\n", resultado); break;
            case 4: resultado = !(A || B);   printf("Resultado NOR: %d\n", resultado); break;
            case 5: resultado = A ^ B;       printf("Resultado XOR: %d\n", resultado); break;
            case 6: resultado = !(A ^ B);    printf("Resultado XNOR: %d\n", resultado); break;
            case 7: resultado = !A;          printf("Resultado NOT A: %d\n", resultado); break;
            case 0: printf("Encerrando o simulador...\n"); break;
            default: printf("Opcao invalida! Tente novamente.\n"); break;
        }

    } while (opcao != 0);

    return 0;
}
