package atividades2;

import java.util.Scanner;

public class E18 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double n;
		
		System.out.println("Informe um numero de 1 a 10 : ");
		n = leia.nextDouble();
		
		if (n >= 9 && n<= 10) {
			System.out.println("A");
		} else if (n >= 7 && n < 9) {
			System.out.println("B");
		} else if (n >= 5 && n < 7) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}

}
