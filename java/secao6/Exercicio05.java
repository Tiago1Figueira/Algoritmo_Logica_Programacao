package br.com.geekuniversity.secao6;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//Variáveis
		float m, e, peso;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o peso de peixe:");
		peso = teclado.nextFloat();
		
		//processamento
		if (peso > 50) {
			e = (float)(peso - 50);
			m = (float)(e * 4.00);
			System.out.printf("Excesso: %.2f\n", e);
			
			System.out.printf("Multa: %.2f", m);
		}
		else { 
			m = 0; 
			e = 0;
			System.out.println("Multa:" + m);
			System.out.println("Excesso: " + e);
		}		
		teclado.close();
		}

		}
