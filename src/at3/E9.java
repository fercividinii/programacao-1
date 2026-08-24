package at3;

import java.util.Scanner;

public class E9 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num, i=0, cont=0;
		while (i<999) {
			System.out.println("Imprima um numero -1 p parar");
			num = leia.nextInt();
			cont++;
			
			if (num==-1)
			{
				break;
			}
		}
		System.out.println("Imprimiu "+cont+" numeros");
	}

}
