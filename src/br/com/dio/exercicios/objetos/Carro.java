package br.com.dio.exercicios.objetos;

public class Carro {

	String cor;
	String modelo;
	double capacidadeTanque;
	
	Carro(){
		
	}
	
	Carro(String cor, String modelo, double capacidadeTanque){
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	void setCor(String cor){
		this.cor = cor;
	}
	String getcor() {
		return this.cor;
	}
	
	void setModelo(String modelo) {
		this.modelo = modelo;
	}
	String getModelo() {
		return this.modelo;
	}
	
	void setCapacidadeTanque(double capacidade) {
		this.capacidadeTanque = capacidade;
	}
	double getCapacidadeTanque() {
		return this.capacidadeTanque;
	}
	
	double valorTotalCombustivel(double valor) {
		return this.capacidadeTanque * valor;
	}
	
	
	
}
