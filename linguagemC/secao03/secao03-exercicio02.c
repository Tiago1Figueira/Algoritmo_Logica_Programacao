#include <stdio.h>

int main(){
	// Declaração de variáveis
	int estoque_medio, quantidade_minima, quantidade_maxima;

	// Entradas
	printf("Informe a quantidade mínima do estoque:");
	scanf("%d", &quantidade_minima);

	printf("Informe a quantidade máxima:");
	scanf("%d", &quantidade_maxima);

	// Processamento
	estoque_medio = quantidade_minima + quantidade_maxima / 2;

	// Saída
	printf("O estoque médio será %d.", estoque_medio);

}
