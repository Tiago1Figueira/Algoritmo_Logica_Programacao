#include <stdio.h>

int main(){

	float valor_hora, salario;
	int num_horas;

	printf("Insira o valor da hora trabalhada:");
	scanf("%f", &valor_hora);

	printf("Insira o número de horas trabalhadas:");
	scanf("%d", &num_horas);

	salario = valor_hora * num_horas;

	printf("%d horas trabalhadas correspondem a r$ %.2f de salário.", num_horas, salario);

}
