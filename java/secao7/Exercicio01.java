package br.com.geekuniversity.secao7;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// variáveis
		int numero, maior=0;
		Scanner teclado = new Scanner (System.in);
		
		//entradas 
		System.out.println("Informe o número:");
		numero = teclado.nextInt();
		
		//processamento
		while (numero !=0) {
			if (numero > maior) {
				maior = numero;
			}
			System.out.println("Informe o número:");
			numero = teclado.nextInt();
		} 
		System.out.printf("O maior número é %d ", maior);
		maior = teclado.nextInt();
		teclado.close();		
	}

}
