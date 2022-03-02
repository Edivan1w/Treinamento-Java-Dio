package br.com.dio.exercicios.objetos;

public class TesteCalculo {

	public static void main(String[] args) {
		
		Calculo calculo = new Calculo();
		System.out.println(calculo.soma(10, 3));
		System.out.println(calculo.subtracao(10, 3));
		System.out.println(calculo.multiplicao(10, 3));
		System.out.println(calculo.divisao(10, 3));
	
}
}
