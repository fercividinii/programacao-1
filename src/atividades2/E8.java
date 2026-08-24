package atividades2;

import java.util.Scanner;

public class E8 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double s;
		
		System.out.println("Digite o salario: ");
		s = leia.nextDouble();
		
		if (s < (1.621*2)) {
			System.out.println("Baixa renda");
		} else if (s > (1.621*2) && s < (1.621*5)) {
			System.out.println("Media renda");
		} else {
			System.out.println("Alta renda");
		}
	}

}
