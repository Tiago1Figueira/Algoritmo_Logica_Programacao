package br.com.geekuniversity.secao3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//variáveis
		int quantidade_minima, quantidade_maxima;
		float estoque_medio;
		Scanner teclado = new Scanner (System.in);
		
		//entradas
		System.out.println("A quantidade mínima é:");//sysout + ctrl + barra espaço
		quantidade_minima = teclado.nextInt();
		System.out.println("A quantidade máxima é:");
		quantidade_maxima = teclado.nextInt();
		
		//Processamento
		estoque_medio = (quantidade_minima + quantidade_maxima)/2;
		
		//Saída
		System.out.println("O valor do estoque médio é " + estoque_medio);
		
		teclado.close();
		
				
		
		
		

	}

}
