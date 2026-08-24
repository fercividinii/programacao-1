package ferc;

import java.util.Scanner;

public class E18 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double p, d;
		
		System.out.println("Digite o valor do produto: ");
		p = leia.nextDouble();
		System.out.println("Digite o percentual de desconto: ");
		d = leia.nextDouble();
		
		System.out.println("O valor do produto com o desconto é "+(p-((p*d)/100)));
	

	}

}
