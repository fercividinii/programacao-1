package ferc;

import java.util.Scanner;

public class E20 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double m;
		
		System.out.println("Quantos minutos voce quer converter: ");
		m = leia.nextDouble();
		
		System.out.println("Os minutos convertidos para segundos são "+(m*60));
		
	}

}
