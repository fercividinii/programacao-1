package atividades2;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n;
		
		System.out.println("Informe um numero: ");
		n = leia.nextDouble();
		
		if (n > 0 && n < 101) {
			System.out.println("entre 0 e 100");
		} else if (n > 100) {
			System.out.println("acima de 100");
		} else {
			System.out.println("abaixo de 0");
		}
	
	}

}
