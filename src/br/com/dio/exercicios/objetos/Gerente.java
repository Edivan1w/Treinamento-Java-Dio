package br.com.dio.exercicios.objetos;

public class Gerente extends Funcionario {
	
	int senha = 2222;
	
	void setSenha(int senha) {
		this.senha = senha;
	}

	int getSenha() {
		return this.senha;
	}
}
