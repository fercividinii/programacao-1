package at3;

import java.util.Scanner;

public class E20 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String frase;
		int n, i=0;
		
		System.out.println("Digite uma frase");
		frase = leia.nextLine();
		System.out.println("Digite um numero");
		n = leia.nextInt();
		
		while (i<n) {
			System.out.println((i+1)+"."+frase);
			i++;
		}
		
	}

}
