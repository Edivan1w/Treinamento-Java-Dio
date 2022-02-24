

public class Teste {

	public static void main(String[] args) {
		
		Calculadora teste = new Calculadora();
		
		teste.soma(50, 100);
		teste.subtracao(100, 50);
		teste.multiplicacao(5, 20);
		teste.divisao(50, 5);
		
		
		Saudacao saud = new Saudacao();
		saud.saudacao(24);
		
		Emprestimo emp = new Emprestimo();
		emp.calculaTaxa(1000, 25);
		
		//teste quadrilateros.
		
		CalculoArea calculo = new CalculoArea();
		calculo.area(12);
		calculo.area(12, 5);
		calculo.area(5, 2, 3);
	}

}
