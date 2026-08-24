package ferc;

import java.util.Scanner;

public class E7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
		System.out.println("A idade em dias é "+(idade*365));

	}

}
