package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Tabuada2 {

	public static void main(String[] args) {
		
	   Scanner scan = new Scanner(System.in);
	   int numero;
	   System.out.println("Digite um numero de 1 a 10 para lhe mostra a tabuada.");
	   numero = scan.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println( numero + " x " + numero * i);
		}
		
	}
}
