
public class Emprestimo {
	
	public static double taxaAbaixoDezParcelas() {
		return 0.05;
	}
	public static double taxaAbaixoVinteParcelas() {
		return 0.08;
	}
	public static double taxaAbaixoTrintaParcelas() {
		return 0.1;
	}
	
	public static void calculaTaxa(double valor, int parcelas) {
		
		if(parcelas <= 10) {
			valor = valor + (valor * taxaAbaixoDezParcelas());
			System.out.println("O valor total que o cliente ira pagar e " + valor + " reais");
		} else if (parcelas > 11 && parcelas <= 20 ) {
			valor = valor + (valor * taxaAbaixoVinteParcelas());
			System.out.println("O valor total que o cliente ira pagar e " + valor + " reais");
		} if (parcelas > 20 && parcelas <= 30) {
			valor = valor + (valor * taxaAbaixoTrintaParcelas());
			System.out.println("O valor total que o cliente ira pagar e " + valor + " reais");
		}
	}

}
