package ferc;

import java.util.Scanner;

public class E16 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias;
		
		System.out.println("Digite a quantidade de dias: ");
		dias = leia.nextInt();
		
		System.out.println("A quantidade de horas é "+(dias*24));

	}

}
