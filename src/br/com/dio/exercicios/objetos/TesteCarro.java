package br.com.dio.exercicios.objetos;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.setModelo("USV");
		carro.setCor("vermelho");
		carro.setCapacidadeTanque(70);
		
		System.out.println(carro.getModelo());
		System.out.println(carro.getcor());
		System.out.println(carro.getCapacidadeTanque());
		System.out.println(carro.valorTotalCombustivel(7.15));
		System.out.println();
	}
}
