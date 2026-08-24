package ferc;

import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double valor;
		
		System.out.println("Digite o preço do produto ");
		valor = leia.nextDouble();
		
		System.out.println("O valor com imposto é "+(valor+((valor*8)/100)));
	
	}

}
