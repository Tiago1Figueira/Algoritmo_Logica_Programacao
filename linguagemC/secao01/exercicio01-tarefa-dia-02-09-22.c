#include <stdio.h>
#include <stdlib.h>


int main(){
	int quantidade_alunos, nota1, nota2, nota3, nota4, media_aritmetica;

	printf("Insira a quantidade de alunos:");
	scanf("%d", &quantidade_alunos);

	printf("Insira a nota do 1º aluno:");
	scanf("%d", &nota1);

	printf("Insira a nota do 2º aluno:");
	scanf("%d", &nota2);

	printf("Insira a nota do 3º aluno:");
	scanf("%d", &nota3);

	printf("Insira a nota do 4º aluno:");
	scanf("%d", &nota4);

	media_aritmetica = nota1 + nota2 + nota3 + nota4 / 4;

	printf("A média dos 4 alunos será %d.", media_aritmetica);



}
