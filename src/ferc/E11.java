package ferc;

import java.util.Scanner;

public class E11 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		double gramas;
		
		System.out.println("Digite um valor em gramas: ");
		gramas = leia.nextDouble();

		System.out.println("O valor convertido kg é "+(gramas/1000));

	}

}
