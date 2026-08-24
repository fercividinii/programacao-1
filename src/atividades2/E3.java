package atividades2;

import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2;
		
		System.out.println("Digite a primeira nota: ");
		n1 = leia.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = leia.nextDouble();
		
		double m = ((n1+n2)/2);
		
		if (m < 7 && m >= 5) {
			System.out.println("Aprovado pelo conselho");
		} else if (m < 5) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado por media");
		}

	}

}
