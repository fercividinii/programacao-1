package at3;

import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int a = 0 , b = 1 , i , c = 0;

		System.out.println("Escreva um número");
		i = leia.nextInt();

			while(c <= i) {
				System.out.println(a);
				c = a + b;
				a = b;
				b = c ;
			}
		}

}


