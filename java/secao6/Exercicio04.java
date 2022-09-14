package br.com.geekuniversity.secao6;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// variáveis
		float altura, peso_ideal;
		char sexo; 
		Scanner teclado = new Scanner (System.in);
		
		// entradas 
		System.out.println("Informe o sexo:m/f");
		sexo = teclado.next().charAt(0);
		
		System.out.println("Informe a altura:");
		altura = teclado.nextFloat();
		
		//processamento
		if ( sexo == 'm') {
			peso_ideal = (float)(72.7 * altura) - 58;
			System.out.printf("O seu peso ideal é %.2f",peso_ideal);
			
		}if (sexo == 'f') {
			peso_ideal = (float)(62.1 * altura) - (float) 44.7;
			System.out.printf("O seu peso ideal é %.2f",peso_ideal);
		}
		 if (sexo != 'm' && sexo != 'f') {
		System.out.println("Sexo não identificado! Informe sexo: m/f");
		}
		teclado.close();
		
		}

}
