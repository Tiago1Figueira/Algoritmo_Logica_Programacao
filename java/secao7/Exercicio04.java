package br.com.geekuniversity.secao7;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Variáveis
		int numero, maior=-999, menor=999, soma = 0;
		float media;
		Scanner teclado = new Scanner (System.in);
		
		//entradas 
		for (int i=0; i<10; i++) {
		System.out.println("Informe um número positivo:");
		numero = teclado.nextInt();
		
		//processamento
		if (numero > 0) {
		if (numero > maior) {
			maior=numero;
		}
		if (numero < menor) {
			menor = numero;
			
		}
		soma = soma + numero; 
		
		}else {
			i--;
		}
		}
		media = soma/10;
		// saídas
		System.out.printf("O maior número é %d\n", maior);
		System.out.printf("O menor número é %d\n ", menor);
		System.out.printf("A média é %.2f", media);
		teclado.close();
	}

}
