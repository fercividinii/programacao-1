package ferc;

import java.util.Scanner;

public class E1 {
	

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.println("Digite o nome do usuario: ");
		nome = leia.nextLine();
		System.out.println("Digite a idade do usuario: ");
		idade = leia.nextInt();
		
		
		System.out.println("Ola "+nome+" voce tem "+idade+" anos e esta indo muito bem");
		
	}

}
