#include <stdio.h>

int main(){

	int metros, centimetros;

	printf("Informe o valor em metros:");
	scanf("%d", &metros);

	centimetros = metros * 100;

	printf("%d metros correspondem a %d centímetros!", metros, centimetros);
}
