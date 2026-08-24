package at3;

import java.util.Scanner;

public class E16 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num, soma=0;
		
		System.out.println("Digite um numero");
		num=leia.nextInt();
		
		while (num>0) {
			soma+=num;
			num--;
		}
		System.out.println("A soma é: "+soma);
	}

}
