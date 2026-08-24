package atividades2;

import java.util.Scanner;

public class E17 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double c;
		
		System.out.println("Informe o preço : ");
		c = leia.nextDouble();
		
		if (c >= 50 ) {
			System.out.println("parecela em 2x");
		} else if (c >= 100) {
			System.out.println("parcela em 3x");
		} else {
			System.out.println("somente a vista");
		}
	}

}
