package at3;

import java.util.Scanner;

public class E11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num, d=1, i=0;
		System.out.println("Digite um numero");
		num = leia.nextInt();
		
		while (d<=num) {
			if (num%d==0) {
				i++;
			}
			d++;
		}
		System.out.println("O numero possui "+i+" divisores");

	}

}
