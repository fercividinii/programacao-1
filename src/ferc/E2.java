package ferc;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double raio;
		
		System.out.println("Digite o raio do circulo: ");
		raio = leia.nextDouble();
		
		System.out.println("A area do circulo é "+3.14*(raio*2));

	}

}
