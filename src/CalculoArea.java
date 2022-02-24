
public class CalculoArea {
	
	public static double area(double lado) {
		double area = lado * lado;
		System.out.println("Area = " + area);
		return area;
	}
	public static double area(double base, int altura) {
		double area = base * altura;
		System.out.println("Area = " + area);
		return area;
	}
	public static double area(double baseMaior, double baseMenor, double altura) {
		double area = ((baseMaior + baseMenor) * altura) / 2;
		System.out.println("Area = " + area);
		return area;
	}

}
