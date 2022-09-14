package br.com.geekuniversity.secao3;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// variáveis
		float peso_ideal, altura;
		Scanner teclado = new Scanner (System.in);
		
		//entradas 
		System.out.println("Informe a altura:");
		altura = teclado.nextFloat();
		
		//Processamento
		peso_ideal = (float)(72.7 * altura) - 58; 
		
		//Saída
		System.out.printf("O seu peso ideal é %.2f" , peso_ideal);
		
		teclado.close();
		

	}

}
