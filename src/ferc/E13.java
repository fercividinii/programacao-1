package ferc;

import java.util.Scanner;

public class E13 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double base, alt;
		
		System.out.println("Digite o valor da base: ");
		base = leia.nextDouble();
		
		System.out.println("Digite a altura: ");
		alt = leia.nextDouble();
		
		System.out.println("A area do paralelogramo é "+(base*alt));
	}

}
