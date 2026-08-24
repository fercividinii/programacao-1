package atividades2;

import java.util.Scanner;

public class E13 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idd, f;
		
		System.out.println("Informe a sua idade : ");
		idd = leia.nextInt();
		
		if (idd > 17) {
			System.out.println("Pode tirar a carteira");
		} else {
			System.out.println("Faltam "+(18-idd)+" anos para tirar a carteira");
		}

	}

}
