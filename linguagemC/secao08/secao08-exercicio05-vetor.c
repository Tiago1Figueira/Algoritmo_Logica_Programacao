// Mostra todos os números acima de 50 nas suas devidas posições.
#include <stdio.h>

int main(){

	// Declaração de variáveis
	int vetor[10];
	char tem_maior_50 = 0;

	// Entradas
	for(int i=0; i <10; i++){
		printf("Informe o valor do vetor %d/10:", (i+1));
		scanf("%d", &vetor[i]);
	}
	for (int i = 0; i < 10; i++){
		if(vetor[i] > 50){
			printf("O número  %d está na posição %d\n", vetor[i], i);
			tem_maior_50 = 1;
		}

	}
	if(tem_maior_50 < 1){
		printf("Não existe qualquer número maior que 50.");

	}

}
