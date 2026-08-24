package atividades2;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		
		idade = leia.nextInt();
		
		if (idade >= 18 && idade <= 69) {
			System.out.println("Seu voto é obrigatorio");
		} else if (idade == 16 || idade == 17 || idade >= 70) {
			System.out.println("Seu voto é opcional");
		} else {
			System.out.println("Ainda nao pode votar");
		}
		
	}

}
