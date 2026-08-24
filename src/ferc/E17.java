package ferc;

import java.util.Scanner;

public class E17 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
		double c;
		
		System.out.println("Digite o comprimento da aresta de um cubo: ");
		c = leia.nextDouble();
		
		System.out.println("O volume é "+(c*3));
		
	}

}
