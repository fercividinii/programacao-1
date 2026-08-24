package at4;
import java.util.Scanner;
public class E4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int menu, n1, n2;
		System.out.println("Escolha um numero 1-para somar 2-para subtrair 3-para multiplicar 4-para dividir");
		menu = leia.nextInt();
		System.out.println("Digite o primeiro numero");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo numero");
		n2 = leia.nextInt();
		switch (menu) {
		case 1:
			System.out.println(n1+n2);
			break;
		case 2:
			System.out.println(n1-n2);
			break;
		case 3:
			System.out.println(n1*n2);
			break;
		case 4:
			System.out.println(n1/n2);
			break;
			default:
				System.out.println("Vc nao digitou numero entre 1 e 4, seu betinha -500aura");
		}
	}

}
