package atividades2;

import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		double v;
		
		System.out.println("Digite a velocidade: ");
		v = leia.nextDouble();
		
		if (v <= 60) {
			System.out.println("Dentro do limite");
		} else if (v > 60 && v < 80) {
			System.out.println("Atenção");
		} else {
			System.out.println("Multa aplicada");
		}
	}

}
