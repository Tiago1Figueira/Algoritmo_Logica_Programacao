// codigo 1 imprimirá na ordem digitada e codigo 2 na ordem inversa a digitada; 0 termina o programa.
#include <stdio.h>

int main(){
	//declaração de variáveis
	float vetor[5];
	int codigo;

	// Entradas
	printf("Informe o código:");
	scanf("%d", &codigo);
	// Processamento
	if(codigo != 0 ){
		for (int i = 0; i < 5; i++){
			// entradas
			printf("Informe um número real:");
			scanf("%f", &vetor[i]);
		}
		//Processamento
		if(codigo == 1 ){
			for(int i = 0; i < 5; i++){
				printf("%.2f\n", vetor[i]);
		}

		}
		if(codigo == 2){
			for(int i = 4; i >=0; i--){ // i-- informa na ordem inversa a que os elementos foram digitados
				printf("%.2f\n", vetor[i] );
				}
			}

		}
	}




