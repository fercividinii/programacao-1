package at4;
import java.util.Scanner;
public class E6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int menu;
		System.out.println("Escolha entre 1-Naruto 2-Dragon Ball e 3-Pokémon");
		menu = leia.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("Naruto-\"Não é o rosto que faz de alguém um monstro, são as escolhas que elas fazem para as suas vidas.\"");
			break;
		case 2:
			System.out.println("Dragon Ball-\"Os limites so existem se voce os deixar existir\"");
			break;
		case 3:
			System.out.println("Pokémon-\"As circunstâncias do nascimento de alguém são irrelevantes; é o que você faz com o dom da vida que determina quem você é\"");
			break;
		default:System.out.println("Digite entre 1 e 3");
		}

	}

}
