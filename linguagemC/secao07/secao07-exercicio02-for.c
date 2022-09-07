// Contar de 1 a 100 emitindo um print a cada múltiplo de 10.

# include <stdio.h>

int main(){
	for (int i = 1; i <= 100; i++){ // i++ incrementa o loop de 1 em 1 até 100!
		printf("%d\n", i);
		if(i % 10 == 0){
			printf("Múltiplo de 10\n");
			}
		}

}
