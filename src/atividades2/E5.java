package atividades2;

import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um numero: ");
		n = leia.nextInt();
		
		if (n % 2 == 0 && n % 3  == 0) {
			System.out.println("Múltiplo de 2 e 3");
		} else if (n % 2 == 0) {
			System.out.println("Múltiplo apenas de 2");
		} else if (n % 3  == 0) {
			System.out.println("Múltiplo apenas de 3");
		} else {
			System.out.println("Não é múltiplo de 2 nem de 3");
		}

	}

}
