package br.com.geekuniversity.secao6;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// variáveis
		int num1, num2, num3, num4, q1,q2,q3,q4;
		Scanner teclado = new Scanner(System.in);
		
		// entradas 
		System.out.println("Informe o primeiro número:");
		num1 = teclado.nextInt();
		System.out.println("Informe o segundo número:");
		num2 = teclado.nextInt();
		System.out.println("Informe o terceiro número:");
		num3 = teclado.nextInt();
		System.out.println("Informe o quarto número:");
		num4 = teclado.nextInt();
		
		//procedimento
		q1 = num1 * num1;
		q2 = num2 * num2;
		q3 = num3 * num3;
		q4 = num4 * num4;
		
		if (q3>=1000) {
			//saída
			System.out.println("O quadrado do terceiro número maior ou igual a 1000  é " + q3);
					
		}else {
			//saída
			System.out.printf("  número 1: %d   quadrado : %d\n ", num1, q1);
			System.out.printf(" número 2: %d   quadrado : %d\n ", num2, q2);
			System.out.printf(" número 3: %d   quadrado : %d\n ", num3, q3);
			System.out.printf(" número 4: %d   quadrado : %d\n ", num4, q4);
		}
			teclado.close();
		
		
		
		

	}

}
