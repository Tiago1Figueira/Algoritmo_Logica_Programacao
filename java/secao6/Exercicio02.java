package br.com.geekuniversity.secao6;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// variáveis
		int numero, a, b; 
		Scanner teclado = new Scanner(System.in);
		
		//entradas 
		System.out.println("Informe o número:");
		numero = teclado.nextInt();
		
		//processamento
		if (numero > 0) {
			a = numero;
			System.out.println( a + " é positivo!!!" );
			
		} else {
			b = numero;
			System.out.println( b + " é negativo!" );
		}
		teclado.close();
		

	}

}
