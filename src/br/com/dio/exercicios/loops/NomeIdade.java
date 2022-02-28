package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class NomeIdade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome = null;
		int idade;
		
		while(true) { 
	    System.out.println("nome: ");
		nome = scanner.next();
		if(nome.equals("0")) {
			break;
		}
		
		System.out.println("idade: ");
		idade = scanner.nextInt();
		
		}
		
		
	}
}
