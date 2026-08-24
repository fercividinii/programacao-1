package at3;

import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int soma = 0, i = 0, num;
		
		while (i<12)
		{
			System.out.println("Informe um numero");
			num = leia.nextInt();
			
			if (num % 2 == 0) {
				soma+=num;
			}
			i++;
			
		}
		System.out.println("Soma é "+soma);

		

	}

}
