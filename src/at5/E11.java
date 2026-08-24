package at5;
import java.util.Scanner;
public class E11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, c=1;
		
		System.out.println("Digite um numero");
		numero = leia.nextInt();
		
		do {
			if(numero % c == 0) {
			System.out.println(c);
			}
			c++;
		}while(c<=numero);
	}

}
