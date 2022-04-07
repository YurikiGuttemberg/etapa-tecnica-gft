package questaoquatro;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n = scan.nextInt();
		
		for(int i= 3; i<=999;i++) {
		int conta = n / i;	
		if(conta) {
			System.out.println(conta);
		}
			
		}
				
		

	}

}
