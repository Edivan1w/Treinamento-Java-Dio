package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class MaiorEmenor {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero;
		int numeromaior = 0;
		double media = 0;
		int i = 0;
		do {
			System.out.println("Numero: ");
			numero = scan.nextInt();
			if (numero > numeromaior) {
				numeromaior = numero;
			}
			media = media + (numero / 5);
			i = i + 1;
		} while (i < 5);

		System.out.println("O maior numero digitado é " + numeromaior);
		System.out.println("A média dos 5 numeros é " + media);

	}

}
