#include <stdio.h>

int main(){

	float indice;

	printf("Informe o índice de poluição:");
	scanf("%f", &indice);

	if (indice < 0.3){
		printf("Atenção: índice em nível adequado!");
	}
	else if(indice >= 0.3 && indice < 0.4){
		printf("Atenção: indústrias do 1º grupo devem suspender as atividades!");
	}else if (indice >= 0.4 && indice < 0.5){
		printf("Atenção: indústrias do 2º grupo devem suspender as atividades!");
	}else if (indice >= 0.5){
		printf("Atenção: Todos os grupos devem suspender as atividades!");
	}

}
