
public class PraticaComIf {

	public static void main(String[] args) {
		
		if((10 +15) < 10)
			System.out.println("");
		else
			System.out.println();

		testeIf();
		ifFerias();
		maiorMenorIdade();
		diaSemana();
	}

	public static void testeIf() {
		int mes = 15;

		if (mes == 1) {
			System.out.println("janeiro");
		} else if (mes == 2) {
			System.out.println("fevereiro");
		} else if (mes == 3) {
			System.out.println("março");
		} else if (mes == 4) {
			System.out.println("abril");
		} else if (mes == 5) {
			System.out.println("maio");
		} else if (mes == 6) {
			System.out.println("junho");
		} else if (mes == 7) {
			System.out.println("julho");
		} else if (mes == 8) {
			System.out.println("agosto");
		} else if (mes == 9) {
			System.out.println("setenbro");
		} else if (mes == 10) {
			System.out.println("outubro");
		} else if (mes == 11) {
			System.out.println("nonembro");
		} else if (mes == 12) {
			System.out.println("desembro");
		} else {
			System.out.println("digite numeros apenas de 1 a 12");
		}

	}
	
	public static void ifFerias() {
		String mes = "janeiro";
		
		if(mes == "janeiro" || mes == "julho" || mes == "desembro"){
			System.out.println("Pode tirar ferias");
		}
	}
	
	public static void maiorMenorIdade() {
		int idade = -5;
		
		if(idade < 18 && idade >= 0) {
			System.out.println("menor de idade");
		}else if(idade >= 18) {
			System.out.println("maior de idade");
		}else {
			System.out.println("idade invalida");
		}
		
	}
	
	public static void diaSemana() {
		String dia = "terca";
		
		switch(dia) {
		case "domingo":
			System.out.println(1);
			break;
		case "segunda":
			System.out.println(2);
			break;
		case "terca":
			System.out.println(3);
			break;
		case "quarta":
			System.out.println(4);
			break;
		case "quinta":
			System.out.println(5);
			break;
		case "sexta":
			System.out.println(6);
			break;
		case "sabato":
			System.out.println(7);
			break;
		default:
			System.out.println("nao existe esse dia na semana");
			
		}
	}
	
	

}
