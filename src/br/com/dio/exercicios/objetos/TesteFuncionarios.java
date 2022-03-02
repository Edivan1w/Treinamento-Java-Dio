package br.com.dio.exercicios.objetos;

public class TesteFuncionarios {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		
		Gerente gerente2 = (Gerente) new Funcionario();
		Vendedor vendedor2 = (Vendedor) new Funcionario();
		Faxineiro faxineiro2 = (Faxineiro) new Funcionario();
		
	}
}
