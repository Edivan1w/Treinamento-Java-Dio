package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número inteiro para calcular o seu fatorial.");
		int fatorial = scan.nextInt();
		int numero = 1;
		for(int i = fatorial; i > 0; i-- ) {
			numero = numero * i;	
		}
		System.out.println("O fatorial de " + fatorial + " é: " + numero);
	}
}
