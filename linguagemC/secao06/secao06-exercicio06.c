#include <stdio.h>

int main(){

	int c;
	float n, e=0, salario, valor_hora=10;

	printf("Informe o código:");
	scanf("%d", &c);

	printf("Informe a quantidade de horas trabalhadas:");
	scanf("%f", &n);

	if (n > 50) {
		e = (n - 50) * 20;
		salario = (50 * valor_hora) + e;

		printf("Salário Total R$ %.2f\n", salario);
		printf("Salário Excedente R$ %.2f", e);

	}else{
		salario = n * valor_hora;
		printf("Salário Total R$ %.2f\n", salario);
		printf("Salário Excedente: R$ %.2f", e);
}

}
