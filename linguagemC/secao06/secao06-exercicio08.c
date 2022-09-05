#include <stdio.h>

int main(){

	int numero;

	printf("Informe um número:");
	scanf("%d", &numero);

	if (numero % 2 == 0){
		if (numero > 0){
			printf("O número é par positivo!");
		}else{
			printf("O número é par negativo!");
		}


	}
	else{
		if (numero < 0){
			printf("O número é ímpar negativo!");
		}else {
			printf("O número é ímpar positivo!");
		}
	}



}
