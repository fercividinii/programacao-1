package at3;

import java.util.Scanner;

public class E15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);	
		String nome;
		int i=0;
		System.out.println("Digite um nome");
		nome = leia.nextLine();
		while (i<5) {
			System.out.println(nome);
			i++;
		}
		
		
	}

}
