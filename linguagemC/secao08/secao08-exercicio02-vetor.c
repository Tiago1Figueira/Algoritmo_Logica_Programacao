//Algorítmo que lê dois vetores de 10 posições cada somando os vetores de mesma posiçao e
//colocando-os num terceiro vetor.
#include <stdio.h>

int main(){

	int vetor1[10], vetor2[10], soma[10];

	//Entrada
	for (int i = 0; i < 10; i++){
		printf("Informe o valor do primeiro vetor:");
		scanf("%d", &vetor1[i]);
		printf("Informe o valor do segundo vetor:");
		scanf("%d", &vetor2[i]);

		//Processamento
		soma[i]= vetor1[i] + vetor2[i];
	}
	for (int i = 0; i < 10; i++){
		printf("%d\n", soma[i]);

	}
}
