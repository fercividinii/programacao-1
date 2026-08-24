package ferc;

import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Digite o valor do produto: ");
		valor = leia.nextDouble();
		
		System.out.println("O valor com acressimo é "+(valor+((valor*10)/100)));

	}

}