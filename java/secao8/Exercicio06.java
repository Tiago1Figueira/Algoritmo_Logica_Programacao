package br.com.geekuniversity.secao8;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//Variáveis
		float [] vetor = new float [5];
		int codigo; 
		Scanner teclado = new Scanner (System.in);
		
		//entradas 
		System.out.println("Informe o CÓDIGO:");
		codigo = teclado.nextInt();
		
		if (codigo == 0 ) {
			System.out.println("Termino do sistema!\nInforme um dos códigos: 1 ou 2!");
		}
		if (codigo > 2) {
			System.out.println("Termino do sistema!\nInforme um dos códigos: 1 ou 2!");
		}
		if (codigo !=0 && codigo<=2) {
			for (int i=0; i< 5; i++) {
			System.out.printf("Informe um vetor: %d/5\n", (i+1) );
			vetor[i]= teclado.nextFloat();
			}
			if (codigo ==1) {
				for (int i=0; i<5; i++) {
					System.out.println(vetor[i]);
				}
			}
			if (codigo ==2) {
				for (int i=(vetor.length - 1); i>=0; i--) {
				System.out.println(vetor[i]);
			}
			
			}
		}
			teclado.close();
		}
	}
		
		
		
		
		
		
		

	


