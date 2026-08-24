package at3;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num, i=0, soma=0;
		while (i<999) {	
		System.out.println("Imprima um numero 0 p parar");
		num = leia.nextInt();
		soma+=num;
		
			if (num==0)
			{
			break;
			}
		}
		System.out.println("Soma "+soma);
		
	}

}
