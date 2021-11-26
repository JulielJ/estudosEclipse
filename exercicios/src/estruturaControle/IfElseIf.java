package estruturaControle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digita a nota: ");
		
		double nota = entrada.nextDouble();
		
		if (nota > 10 || nota < 0) {
			System.out.println("Nota inválida!");	
		}else if(nota >= 8.1) {
			System.out.println("Conceito A \nParabéns");
		}else if (nota >= 6.1) {
			System.out.println("Conceito B \nFoi bem!");
		}else if (nota >= 4.1) {
			System.out.println("Conceito C \nReprovado");
		}else if (nota >= 2.1) {
			System.out.println("Conceito D \nCada um que me aparece");
		}else {
			System.out.println("Conceito E \nBurro");
		}
		
		entrada.close();
		
	}

}
