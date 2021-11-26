package exercicios;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu primeiro salario: ");
		System.out.println("Digite o seu segundo salario: ");
		System.out.println("Digite o seu terceiro salario: ");
		
		
		String valor1 = entrada.nextLine().replace(",", ".");
		String valor2 = entrada.nextLine().replace(",", ".");
		String valor3 = entrada.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("a média dos salários é: "+ media);
		
		
		
	}

}
