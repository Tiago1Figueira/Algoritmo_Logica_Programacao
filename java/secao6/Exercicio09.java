package br.com.geekuniversity.secao6;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		//Variáveis
		float indice;
		Scanner teclado = new Scanner (System.in);
		
		//entradas
		System.out.println("Informe o índice:");
		indice = teclado.nextFloat();
		
		//processamento
		
		if (indice < 0.3 ) {
			System.out.println("Índice aceitável!");
			
		} else if (indice >= 0.3 && indice< 0.4 ) {
			System.out.println("Atenção: indústrias grupo 1 suspendem atividades!");
			
		}else if (indice >=0.4 && indice < 0.5 ) {
			System.out.println("Atenção:indústrias grupo 1 e 2 suspendem atividades!");
			
		}else if (indice >= 0.5) {
			System.out.println("Atenção:indústrias de todos os grupos suspendem atividades!");
		}
		
		teclado.close();
	}

}
