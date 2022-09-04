#include <stdio.h>

int main(){

	int num, a, b;

	printf("Insira um número positivo ou negativo:");
	scanf("%d", &num);

	if (num > 0){
		a = num;
		printf("%d é valor positivo.", num);
	}
	else{
		b = num;
		printf("%d é valor negativo.", num);
	}

}
