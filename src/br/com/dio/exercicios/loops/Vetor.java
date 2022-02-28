package br.com.dio.exercicios.loops;

public class Vetor {

	public static void main(String[] args) {

		int[] numero = { 5, 6, 4, 2, 3, 8 };
		int i = numero.length;
		while (i > 0) {
			i--;
			//System.out.println(numero[i]);
		}

		for (int j = numero.length - 1; j >= 0; j--) {
			
            System.out.println(numero[j]);
		}

	}

}
