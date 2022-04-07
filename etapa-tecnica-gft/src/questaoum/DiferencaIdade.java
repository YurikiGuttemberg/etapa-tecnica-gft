package questaoum;

import java.util.Scanner;

public class DiferencaIdade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int anoAtual = 2022;
		
		System.out.println("Escreva o ano de nascimento da primeira pessoa:");
		int primeiroAno = scan.nextInt();
		System.out.println("Escreva o ano de nascimento da segunda pessoa:");
		int segundoAno = scan.nextInt();
		
		int idade1 = anoAtual - primeiroAno;
		int idade2 = anoAtual - segundoAno;
		if(primeiroAno < segundoAno) {
			int resultado = (idade1 - idade2)*365;
			System.out.println("São: " + resultado +"dias de diferença");

		}else {
			int resultado = (idade2 - idade1)*365;
			System.out.println("São: " + resultado + "  dias de diferença.");
		}		

	}

}
