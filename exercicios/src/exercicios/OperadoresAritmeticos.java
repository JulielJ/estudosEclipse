package exercicios;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		double a = 6 * (3 + 2);
		//a variavel b é a parte de cima da primeira equação
		double b = Math.pow(a, 2);
		double primeiraEquacao = b / (3*2);
		
		double c = (1-5)*(2-7);
		double d = Math.pow(c, 2);
		
		double segundaEquacao = d / 2;
		
		double e = primeiraEquacao - segundaEquacao;
		
		double f = Math.pow(e, 3);
		
		
		System.out.println(f);
		System.out.println(segundaEquacao);
	}

}
