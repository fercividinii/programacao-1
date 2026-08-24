package atividades2;

import java.util.Scanner;

public class E7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a;
		
		System.out.println("Digite sua altura: ");
		a = leia.nextDouble();
		
		if (a > 1.80) {
			System.out.println("Alto");
		} else if (a < 1.45) {
			System.out.println("Baixa");
		} else {
			System.out.println("Media");
		}
	}

}
