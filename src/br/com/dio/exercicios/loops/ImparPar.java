package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class ImparPar {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int numeros;
		int i = 0;
		int par = 0;
        int impar = 0;		
		
		do {
			System.out.println("Digite 1 n�mero inteiro");
			numeros = scan.nextInt();
			if(numeros % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			i++;
		}while(i < 5 );
		
		System.out.println("A quantidade de numeros pares �: " + par);
		System.out.println("A quantidade de numeros impares �: " + impar);
		
	}

}
