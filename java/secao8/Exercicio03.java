package br.com.geekuniversity.secao8;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Variáveis
		int []vetor = new int[10] ;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas 
		for (int i=0; i < 10; i++) {
			System.out.println("Informe o vetor:");
			vetor[i]= teclado.nextInt();
		}
		for (int i = (vetor.length -1) ; i >= 0; i--) {
			System.out.println(vetor[i]);
		}
		
		teclado.close();
		
	}

}
