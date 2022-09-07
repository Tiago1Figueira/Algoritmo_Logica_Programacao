// Imprimir todos os ímpares de 100 a 200.
#include <stdio.h>

int main(){
	for (int i = 100; i <= 200; i++){
		if (i % 2 != 0){
			printf("%d\n", i);
		}
	}

}
