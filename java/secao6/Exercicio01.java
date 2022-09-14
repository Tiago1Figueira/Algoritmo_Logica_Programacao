package br.com.geekuniversity.secao6;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// variáveis 
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o número:");
		numero = teclado.nextInt();
		
		//Processamento
		if (numero>100) {
			System.out.println("numero " + numero);
			} 
		else { 
			numero = 0;
			System.out.println("numero" + numero);
		}
		teclado.close();
		}
		

}
