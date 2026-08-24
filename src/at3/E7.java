package at3;

import java.util.Scanner;

public class E7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int i, num, f;
		
		System.out.println("Informe um numero");
		num = leia.nextInt();
		i=num;
		f = 1;
		
		while (i>0) {
			f*= i;
			i--;
		}
		System.out.println("O fatorial de "+num+" é "+f);
			
	}

}
