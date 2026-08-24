package atividades2;

import java.util.Scanner;

public class E6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int m;
		
		System.out.println("Digite um mes: ");
		m = leia.nextInt();
		
		if (m > 6 && m < 12) {
			System.out.println("Primavera");
		} else if (m > 2 && m < 6) {
			System.out.println("Outono");
		} else if (m > 5 && m < 9) {
			System.out.println("Inverno");
		} else {
			System.out.println("Verao");
		}
	}

}
