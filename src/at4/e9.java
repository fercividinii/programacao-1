package at4;
import java.util.Scanner;
public class e9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int menu, t;
		System.out.println("Digite 1-Criança (até 5 anos) 2-Estudante 3-Adulto 4-Idoso (acima de 65)");
		menu = leia.nextInt();
		System.out.println("Digite o valor da tarifa");
		t = leia.nextInt();
		
		switch (menu) {
		case 1: 
			System.out.println("Gratis");
			break;
		case 2:
			System.out.println("50% de desconto: R$"+t/2.0);
			break;
		case 3:
			System.out.println("Valor cheio "+t);
			break;
		case 4:
			System.out.println("Gratis");
			break;
			default:
				System.out.println("Digite um numero correspondente");
			
		}
		

	}

}
