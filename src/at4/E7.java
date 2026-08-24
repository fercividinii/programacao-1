package at4;
import java.util.Scanner;
public class E7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int real, menu;
		System.out.println("Digite um valor inteiro em reais");
		real = leia.nextInt();
		System.out.println("Digite um valor para converter 1-Dolar 2-Euro 3-Libra");
		menu = leia.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println(real/6.12);
			break;
		case 2:
			System.out.println(real/6.23);
			break;
		case 3:
			System.out.println(real/7.43);
			break;
			default:
				System.out.println("Faça corretamente as instruções do menu");
			
		}
		
	}

}
