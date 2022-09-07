//Coloca 10 números quaisquer na posição contrária a que foram digitados.
#include <stdio.h>


int main(){

	//Declaração de variáveis
	int vetor[10];// 0 a 9

	// Entradas
	for (int i = 0; i < 10; i++){
		printf("Informe um valor para o vetor:");
		scanf("%d", &vetor[i]);
	}
	for (int i = 9; i >= 0; i--){ // i-- decresce o numero: digitou 7,8,9,10, mostrará 10,9,8,7
		printf("%d\n", vetor[i]);
	}

}
