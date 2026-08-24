package at3;

import java.util.Scanner;

public class E8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int c=1, ma=0, me=0, num;
		
		while (c<=20) {
			System.out.println("Informe um numero");
			num = leia.nextInt();
			if (c==1) {
				ma=num;
				me=num;
			}
			else {
				if (num>ma) {
					ma=num;
				}
				if (num<me) {
					me=num;
				}
			}
			c++;
				}
		System.out.println("O maior numero digitado foi "+ma);
		System.out.println("O menor numero digitado foi "+me);
	}

}
