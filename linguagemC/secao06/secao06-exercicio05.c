#include <stdio.h>

int main(){

	float p = 0, e = 0, m = 0;

	printf("Informe a quantidade de peixes:");
	scanf("%f", &p);

	if (p > 50){
		e = p - 50;
		m = e * 4;
		printf("O valor da multa é de %.2f\n", m);
	}
	else{
		m = 0;
		e = 0;
		printf("Excesso %.2f\n", e);
		printf("Multas %.2f\n", m);
	}


}
