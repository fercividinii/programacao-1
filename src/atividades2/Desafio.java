package atividades2;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3;
		int p;
		String tf;
		
		System.out.println("Digite a primeira nota: ");
		n1 = leia.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = leia.nextDouble();
		System.out.println("Digite a terceira nota: ");
		n3 = leia.nextDouble();
		System.out.println("Digite o percentual de presença (0 a 100%): ");
		p = leia.nextInt();
		System.out.println("Você entregou o trabalho final (S/N): ");
		tf = leia.next();
		
		
		double m = (n1 + n2 + n3) / 3.0;
		System.out.println("Sua media é "+m);
		System.out.println("Seu percentual é "+p+"%");
		
		if (m >= 7 && p >= 75 && tf.equalsIgnoreCase("s")) {
			System.out.println("Sua situação final é aprovado");
		} else if (m >= 6 && m <= 7 && p >= 90) {
			System.out.println("Sua situação final é aprovado pelo conselho");
		} else if (p < 75) {
			System.out.println("Sua situação final é reprovado por falta");
		} else if (m < 6) {
			System.out.println("Sua situação final é reprovado por falta");
		} else if (tf.equalsIgnoreCase("n")) {
			System.out.println("Sua situação final é documento pendente");
		}
		
	}

}
