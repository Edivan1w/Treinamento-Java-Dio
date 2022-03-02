package br.com.dio.exercicios.objetos;

public class Calculo implements OperacaoMatematica{
	
	
	@Override
	public double soma(double numero1, double numero2) {
		return numero1 + numero2;
		
	}

	@Override
	public double subtracao(double numero1, double numero2) {
		return numero1 - numero2;
		
	}

	@Override
	public double multiplicao(double numero1, double numero2) {
		return numero1 * numero2;
		
	}

	@Override
	public double divisao(double numero1, double numero2) {
		return numero1 / numero2;
		
	}

}
