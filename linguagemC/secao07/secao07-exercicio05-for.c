// Recebe o nome e senha de usuário e não aceite senha igual ao nome do usuário dando mensagem de erro.
// contem erro com o while.
#include <stdio.h>
#include <string.h>

int main(){

	// Variáveis
	char nome[100], senha[100];

	// Entradas
	printf("Informe um nome:");

	printf("Informe a senha:");


	// Processamento
	if(!strcmp(nome, senha)){
		printf("Nome e senha do usuário devem ser diferentes.\n");
		printf("Informe um nome:\n");
		printf("Informe a senha:\n");



	}



}
