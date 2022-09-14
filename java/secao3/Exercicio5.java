package br.com.geekuniversity.secao3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//Variáveis
		float metros, quantidade_centimetros;
		Scanner teclado = new Scanner (System.in); 
		
		//Entradas
		System.out.println("Informe quantidade de metros:");
		metros = teclado.nextFloat();
		
		//Processamento
		quantidade_centimetros = (metros * 100) ;
		
		// Saída
		System.out.println( metros + " metros em centímetros são " + quantidade_centimetros);
		
		teclado.close();
	}

}
