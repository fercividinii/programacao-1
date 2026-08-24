package atividades2;

import java.util.Scanner;

public class E15 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double p1, p2, p3;
		
		System.out.println("Informe o primeiro preço : ");
		p1 = leia.nextDouble();
		System.out.println("Informe o segundo preço : ");
		p2 = leia.nextDouble();
		System.out.println("Informe o terceiro preço : ");
		p3 = leia.nextDouble();
		
		if (p1 < p2 && p1 < p3) {
			System.out.println("O primeiro é mais barato");
		} else if (p2 < p3) {
			System.out.println("O segundo é mais barato");
		} else {
			System.out.println("O terceiro é mais barato");
		}
		
	}

}
