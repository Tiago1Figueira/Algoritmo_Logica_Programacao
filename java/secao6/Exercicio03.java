package br.com.geekuniversity.secao6;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//Variáveis
		int numero, p=0, i=0;
		Scanner teclado = new Scanner(System.in);
		//entradas 
		System.out.println("Informe o número:");
		numero = teclado.nextInt();
		//processamento
		if (numero % 2 == 0) {
			p = numero;
		} else {
			i = numero; 	
		}
		//saída
		System.out.println(p + " é par!!");
		System.out.println(i + " é ímpar!");
		
		teclado.close();
		}
	    
	    }
