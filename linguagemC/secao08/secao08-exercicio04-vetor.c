// recebe 20 elementos em um vetor e depois os soma a todos:
#include <stdio.h>

int main(){

	// Declaração de variáveis
	int vetor[20], soma = 0;

	// entradas
	for (int i = 0; i < 20; i++){
		printf("Informe o valor para o vetor %d/20", (i + 1));
		scanf("%d", &vetor[i]);
		soma = soma + vetor[i];
		}
	printf("A soma do vetor é %d", soma);
}

