package at3;

import java.util.Scanner;

public class E18 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, di=1, total=0;
				
				System.out.println("Digite um numero inteiro positivo");
				num = leia.nextInt();
				
				if (num <= 0) {
					System.out.println("Por favor, digite um numero maior que zero");
				}else {
					System.out.println("Divisores de "+num);
					
					while (di <= num) {
						if (num % di == 0) {
							System.out.println(di+"\n");
							total++;
						}
						di++;
					}
					if (total == 2) {
						System.out.println(num+" é um numero primo");
					}else {
						System.out.println(num+" não é um numero primo");
					}
				}
		

	}

}
