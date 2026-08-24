package atividades2;

import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2;
		
		System.out.println("Informe a nota do primeiro aluno : ");
		n1 = leia.nextDouble();
		System.out.println("Informe a nota do segundo aluno : ");
		n2 = leia.nextDouble();
		
		if (n1 > n2) {
			System.out.println("O primeiro tem a maior");
		} else if (n2> n1){
			System.out.println("O segundo tem a maior");
		} else {
			System.out.println("Iguais");
		}
		

	}

}
