package br.com.geekuniversity.secao7;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// variáveis
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe um número entre 1 e 10:");
		numero = teclado.nextInt();
		
		//processamento
		while(numero < 1 || numero >10) {
			System.out.println("Informe um número entre 1 e 10:");
			numero = teclado.nextInt();
		}		
		for(int i=1; i<=10; i++) {
			System.out.printf("%d x %d = %d\n", numero, i, (numero * i));
			
		}
		
		teclado.close();
	}

}
