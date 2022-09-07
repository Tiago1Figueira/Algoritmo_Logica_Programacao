//
#include <stdio.h>

int main(){
	// Variáveis
	int contador_total = 0, contador_sit1 = 0, contador_sit2 = 0, contador_sit3 = 0, contador_sit4 = 0,
			identificacao, defeito;

	// Entradas
	printf("Informe um número de identificação:");
	scanf("%d", &identificacao);

	while (identificacao != 0){
		printf("1 - Necessita de esfera.\n");
		printf("2 - Necessita de limpeza.\n");
		printf("3 - Necessita de troca de cabo ou conector.\n");
		printf("4 - Quebrado ou inutilizado.\n");
		printf("Informe o tipo de defeito:\n");
		scanf("%d", &defeito);

	// Processamento
		if(defeito == 1){
			contador_sit1 = contador_sit1 + 1;
		}
		if(defeito == 2){
			contador_sit2 = contador_sit2 + 1;
		}
		if(defeito == 3){
			contador_sit3 = contador_sit3 + 1;
		}
		if(defeito == 4){
			contador_sit4 = contador_sit4 + 1;
		}
		contador_total = contador_total +1;

		// Entradas
		printf("Informe um número de identificação:");
		scanf("%d", &identificacao);
		}
	float p1,p2,p3,p4; // (float) cast
	p1 = ((float)contador_sit1 / (float)contador_total * 100);
	p2 = ((float)contador_sit2 / (float)contador_total * 100);
	p3 = ((float)contador_sit3 / (float)contador_total * 100);
	p4 = ((float)contador_sit4 / (float)contador_total * 100);

	printf("Quantidade de Mouses %d\n\n", contador_total);
	printf("Situação  \t\t\t\t\Quantidade \tPercentual\n ");
	printf("1- Necessidade de Esfera \t\t%d \t.2f%% \n", contador_sit1, p1);
	printf("2- Necessidade de Limpeza\t\t%d \t.2f%% \n", contador_sit2, p2);
	printf("3- Troca do cabo ou conector \t\t%d \t.2f%% \n", contador_sit3, p3);
	printf("4- Quebrado ou inutilizado \t\t%d \t.2f%% \n", contador_sit4, p4);


}
