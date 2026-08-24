package at4;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias;
		
		System.out.println("Digite um valor de 1 a 7");
		dias = leia.nextInt();
		
		switch(dias) {
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda-feira");
			break;
			
		case 3:
			System.out.println("Terça-feira");
			break;
			
		case 4:
			System.out.println("Quarta-feira");
			break;
			
		case 5:
			System.out.println("Quinta-feira");
			break;
			
		case 6:
			System.out.println("Sexta-feira");
			break;
			
		case 7:
			System.out.println("Sabado");
			break;
			
			default:
				System.out.println("Digite um número válido");
		}
	}

}
