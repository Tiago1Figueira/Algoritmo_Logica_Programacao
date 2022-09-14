package br.com.geekuniversity.secao7;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// variáveis
		String nome, senha;
		Scanner teclado = new Scanner(System.in);
		
		//entradas 
		System.out.println("Informe o nome:");
		nome = teclado.next();
		
		System.out.println("Informe a senha:");
		senha = teclado.next();
		
		
		//processamento
		while (nome.equals (senha)) { //No C é !strcmp . 
			System.out.println("Erro: Nome e senha devem ser diferentes!");
			//entradas 
			System.out.println("Informe o nome:");
			nome = teclado.next();
			
			System.out.println("Informe a senha:");
			senha = teclado.next();	
			
			
		}
		teclado.close();
		
	}

}
