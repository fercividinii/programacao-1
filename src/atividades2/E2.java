package atividades2;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextDouble();
		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextDouble();
		System.out.println("Digite o terceiro numero: ");
		n3 = leia.nextDouble();
		
		if (n1 < n2 && n1 < n3) {
			System.out.println("O primeiro é o menor");
		} else if (n2 < n3) {
			System.out.println("O segundo é o menor");
		} else {
			System.out.println("O terceiro é o menor");
		}
		
	}

}
