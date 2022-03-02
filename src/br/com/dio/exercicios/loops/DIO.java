package br.com.dio.exercicios.loops;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DIO {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	double A = leitor.nextDouble();
    	double B = leitor.nextDouble();
    	//Escreva aqui a sua lógica
    	double percentualAumento;
   
    	percentualAumento = ((B - A)/A)*100;
    	System.out.printf("%.2%%", percentualAumento);
    	System.out.println(new DecimalFormat("#.##").format(percentualAumento) + "%");
    }
	
}
