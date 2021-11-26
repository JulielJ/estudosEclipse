package exercicios;

public class TiposPrimitivos {
public static void main(String[] args) {
	byte anosDeEmpresa = 23;
	short numeroDeVoos = 542;
	int id = 56789;
	long pontosAcumulados = 3_234_845_223L;
	
	
	// tipos numericos
	float salario = 11_445.44f;
	double vendasAcumuladas = 2_991+797_103.01;
	
	
	boolean estaDeFerias = false;
	
	char status = 'A';
	
	System.out.println(anosDeEmpresa * 365);
	
	System.out.println(numeroDeVoos / 2);
	
	System.out.println(pontosAcumulados / vendasAcumuladas);
}

}
