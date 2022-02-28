package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		
		Scanner scaner = new Scanner(System.in);
		
		double nota = 0;
		
		
		
		while(true){
			System.out.println("digite uma nota.");
			nota = scaner.nextInt();
			if(nota >= 0 && nota <= 10) {
			System.out.println("nota valida");
			break;
			}else {
				System.out.println("nota invalida");
				
			}
		}
		

	}

}
