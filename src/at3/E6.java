package at3;

import java.util.Scanner;

public class E6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int cont = 0, i = 0, num;
		
		while (i<15)
		{
			System.out.println("Informe um numero");
			num = leia.nextInt();
			
			if (num > 9 && num < 51) {
				cont++;
			}
			i++;
			
		}
		System.out.println("Tem "+cont+" numeros ente 10 e 50");

		

	}

}
