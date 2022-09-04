#include <stdio.h>

int main(){

	int num, p = 0, i = 0;

	printf("Informe um número:");
	scanf("%d", &num);

	if(num % 2 == 0){
		p = num;
	}
	else{
		i = num;
	}
	printf("%d \n", p);
	printf("%d ", i);
}
