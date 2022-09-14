package br.com.geekuniversity.secao6;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		// variáveis
		int  c ;
		float n, e=0, salario, valor_hora = (float)10.00;
		Scanner teclado = new Scanner (System.in);
				
		//entradas
		System.out.println("Informe o código:");
		c = teclado.nextInt();
		
		System.out.println("Informe o número de horas trabalhadas:");
		n = teclado.nextFloat();
		
		//processamento
		if (n > 50) {
			e = (float)(n - 50) * (float)20.00;
			salario = (float) (50 * valor_hora) + e;
			System.out.printf("O salário é R$ %.2f\n", salario);
			System.out.printf("O excesso é R$ %.2f", e);
			
		}
		else {
			e = 0;
			salario = (float)(n * valor_hora);	
			System.out.printf("O salário é R$ %.2f\n", salario);
			System.out.printf("O excesso é R$ %.2f\n", e);
			System.out.printf("O código é %d", c);
		}
		
		teclado.close();
		}

}
