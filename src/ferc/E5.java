package ferc;

import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double A, B;
		
		System.out.println("Digite o primeiro numero: ");
		A = leia.nextDouble();
		System.out.println("Digite o segundo numero: ");
		B = leia.nextDouble();
		
		System.out.println("A diferença do primeiro p segundo é "+(A-B));
		System.out.println("A diferença do segundo p primeiro é "+(B-A));

	}

}