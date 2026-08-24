package ferc;

import java.util.Scanner;

public class E15 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3;
		
		System.out.println("Digite um numero: ");
		n1 = leia.nextDouble();
		System.out.println("Digite um numero: ");
		n2 = leia.nextDouble();
		System.out.println("Digite um numero: ");
		n3 = leia.nextDouble();
		
		System.out.println("A media dos numero é "+((n1+n2+n3)/3));

	}

}
