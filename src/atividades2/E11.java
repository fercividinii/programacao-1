package atividades2;

import java.util.Scanner;

public class E11 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a;
		
		System.out.println("Informe o ano q nasceu : ");
		a = leia.nextInt();
		
		if (a > 2008) {
			System.out.println("menor de idade");
		} else {
			System.out.println("maior de idade");
		}

	}

}
