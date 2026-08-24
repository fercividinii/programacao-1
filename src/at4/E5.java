package at4;

import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		 
		int menu;
		System.out.println("Escolha 1 produto (1, 2 ou 3)");
		menu = leia.nextInt();
		
		switch (menu) {
		case 1: 
			System.out.println("Salgadinho, 15,90");
			break;
		case 2:
			System.out.println("Refrigerante, 9,99");
			break;
		case 3:
			System.out.println("Biscoito, 5,75");
			break;
			default:
				System.out.println("Digite um numero de 1 a 3");
		}

	}

}
