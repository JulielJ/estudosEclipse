package exercicios;

public class Temperatura {

	public static void main(String[] args) {
// °f - 32 x 5.0/9.0 = °c
		
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 150;
		double celsius = ( fahrenheit - AJUSTE ) * FATOR;
		System.out.println("O resultado é "+ celsius + "c.");
		
	}

}
