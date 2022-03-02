package br.com.dio.exercicios.objetos;

public class TesteClassesFilhas {
	public static void main(String[] args) {
		
		ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae() };
		
		for(ClasseMae classe : classes) {
			classe.metodo1();
		}
		
		System.out.println();
		
		for(ClasseMae classe : classes) {
			classe.metodo2();
		}
	}

}
