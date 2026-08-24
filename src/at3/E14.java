package at3;

import java.util.Scanner;

public class E14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, i=1;
		
		System.out.println("Informe o numero para a tabuada");
		num = leia.nextInt();
		
		System.out.println("Tabuada de "+num);
		while (i<=10) {
			System.out.println(num+" x "+i+" = "+(num*i));
			i++;
		}
	}

}
