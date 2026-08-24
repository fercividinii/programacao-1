package ferc;

import java.util.Scanner;

public class E8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double di;
		
		System.out.println("Digite o diametro: ");
		di = leia.nextDouble();
		
		System.out.println("O valor do raio é "+(di/2));

	}

}
