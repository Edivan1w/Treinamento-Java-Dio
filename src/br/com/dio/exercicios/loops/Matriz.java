package br.com.dio.exercicios.loops;

import java.util.Random;

public class Matriz {

	public static void main(String[] args) {
		Random randon = new Random();
		
		int[][] matriz = new int[4][4];
		
	
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = randon.nextInt(9);
			}
		}
		
		for(int[] linha : matriz) {
			for(int coluna : linha) {
				System.out.print(coluna + " ");
			}
			System.out.println();
		}
		
	}

}
