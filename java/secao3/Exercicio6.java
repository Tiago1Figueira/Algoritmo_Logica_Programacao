package br.com.geekuniversity.secao3;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		//variáveis
		int horas_trabalhadas;
		float valor_hora, salario_total;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		System.out.println("Informe quantidade de horas trabalhadas:");
		horas_trabalhadas = teclado.nextInt();
		
		System.out.println("Informe o valor hora:");
		valor_hora = teclado.nextFloat();
		
		//Processamento
		salario_total = (horas_trabalhadas * valor_hora); 
		
		//Saída
		System.out.println("O valor do salário total é  " + salario_total);
		
		teclado.close();

	}

}
