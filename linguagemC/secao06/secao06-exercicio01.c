#include <stdio.h>

int main (){

	float n;

	printf("Insira um número:");
	scanf("%f", &n);

	if(n > 100){
		printf("%.2f", n);
	}
	else{
		n = 0;
		printf("%.2f", n);
	}


}
