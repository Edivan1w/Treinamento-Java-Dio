package br.com.dio.exercicios.loops;

import java.util.Random;

public class NumerosAleatórios2 {
 public static void main(String[] args) {
	

	
		
		Random randon = new Random();
		int[] numerosAleatorios = new int[20];
		System.out.println("Números aleatórios");
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int numero = randon.nextInt(100);
			
			numerosAleatorios[i] = numero;
		}
		
		for(int numero : numerosAleatorios) {
			System.out.println(numero);
		}
		System.out.println("-----------------------------");
		for(int numero : numerosAleatorios) {
			System.out.println(numero + 1);
		}
		
	
 }
	

}
