package atividades2;

import java.util.Scanner;

public class E9 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, f;
		double m;
		
		System.out.println("Quantas aulas sao oferecidas no ano: ");
		a = leia.nextInt();
		System.out.println("Quantas aulas vc faltou no ano: ");
		f = leia.nextInt();
		System.out.println("Qual sua media final: ");
		m = leia.nextDouble();
		
		double p = ((f*100)/a);
		
		if (m >= 7 && p <= 25) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}

}
