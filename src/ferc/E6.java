package ferc;

import java.util.Scanner;

public class E6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double reais;
		
		System.out.println("Digite o valor em reais: ");
		reais = leia.nextDouble();
		
		System.out.println("O valor em dolar é "+(reais/5.38));

	}

}