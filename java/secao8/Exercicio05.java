package br.com.geekuniversity.secao8;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		//Variáveis
		int [] vetor = new int[10];
		boolean tem_maior_que_50= false;
		Scanner teclado = new Scanner (System.in);
		
		//entradas
		for (int i=0; i<10; i++) {
			System.out.printf("Informe um vetor: %d/10\n", (i+1));
			vetor[i] = teclado.nextInt();
		}	
		// processamento 
		for (int i=0; i < 10; i++) {
			if (vetor[i]> 50) {
				System.out.printf("O número %d está na posição %d\n", vetor[i], i);
				tem_maior_que_50 = true; 
			}
		}
		if (!tem_maior_que_50) {
			System.out.println("Não há qualquer número maior que 50!");
			
			
		}
		teclado.close();
		}
		
		}
        