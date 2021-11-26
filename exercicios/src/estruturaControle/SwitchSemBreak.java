package estruturaControle;

import java.util.Scanner;

public class SwitchSemBreak {

	public static void main(String[] args) {

//Scanner entrada = new Scanner(Scanner.in);
		
		String faixa = "amarelo";
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei a Bassai-Dai..");
			break;
		case "marrom":
			System.out.println("Sei o Tekki Shodan..");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "vermela":
			System.out.println("Sei o Heian Sandan");
		case "amarelo":
			System.out.println("Sei o Heian nidan");
			
		}
	}

}
