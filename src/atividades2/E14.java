package atividades2;

import java.util.Scanner;

public class E14 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double p1, p2;
		
		System.out.println("Informe o primeiro peso : ");
		p1 = leia.nextDouble();
		System.out.println("Informe o segundo peso : ");
		p2 = leia.nextDouble();
		
		if (p1 > p2) {
			System.out.println("O primeiro peso é maior e o segundo é o menor");
		} else if (p2> p1){
			System.out.println("O segundo peso é maior e o primeiro é o menor");
		} else {
			System.out.println("Iguais");
		}
	
	}

}
