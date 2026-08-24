package ferc;

import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1;
		double n2;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextDouble();
		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextDouble();
		
		System.out.println("A soma é "+(n1+n2));

	}

}