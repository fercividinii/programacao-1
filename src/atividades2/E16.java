package atividades2;

import java.util.Scanner;

public class E16 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n;
		
		System.out.println("Informe um numero : ");
		n = leia.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("par");
		} else {
			System.out.println("impar");
		}
		
	}

}
