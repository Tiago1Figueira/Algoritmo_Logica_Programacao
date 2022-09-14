package br.com.geekuniversity.secao6;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		//Variáveis
		int numero;
		Scanner teclado = new Scanner (System.in);
		
		
		//entradas
		System.out.println("Informe o número:");
		numero = teclado.nextInt();
		
		//processamento 
		if (numero % 2 == 0) {
			if (numero > 0) {
				System.out.printf(" O número %d é par e positivo.", numero);
			}else {
				System.out.printf("O número %d é par e negativo.", numero);
			}}
		
			else { 
				if (numero > 0) {
					System.out.printf("O número %d é ímpar e positivo.", numero);
				} else {
					System.out.printf("O número %d é ímpar e negativo.", numero);
				}
			}
			teclado.close();
			
			}
			}
