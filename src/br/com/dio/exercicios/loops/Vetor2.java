package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//String letra;
		String[] carac = new String[6];
		
		/*System.out.println("Digite caracteres.");
		for(int i = 0; i < carac.length; i++ ) {
			letra = scan.next();
			carac[i] = letra;
		}
		
		System.out.println("cocê digitou " + carac.length + " letras");
		*/
		int quantidadeConsoantes = 0;
		int i = 0;
		System.out.println("Digite 6 letras.");
		do {
			String letra = scan.next();
			
			if(!(letra.equalsIgnoreCase("a")||
					letra.equalsIgnoreCase("e")||
					letra.equalsIgnoreCase("i")||
					letra.equalsIgnoreCase("o")||
					letra.equalsIgnoreCase("u"))) {
				carac[i] = letra;
				quantidadeConsoantes++;
			}
				i++;
			
		}while(i < carac.length);
		
		for(String consoante : carac) {
			if(consoante != null) {
				System.out.println(consoante);
			}
		}
		
        System.out.println(quantidadeConsoantes);
		
		
		
		
	}

}
