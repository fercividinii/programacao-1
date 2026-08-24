package at3;

import java.util.Scanner;

public class E19 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1,n2, in, fim, at;
		System.out.println("Digite um numero");
		n1 = leia.nextInt();
		System.out.println("Digite um numero");
		n2 = leia.nextInt();
		
		if (n1 <= n2) {
			in = n1;
			fim = n2;
		}else {
			in = n2;
			fim = n1;
		}
		
		System.out.println("Numeros ente "+in+" e "+fim);
		
		at = in;
		while (at <= fim) {
			System.out.println(at);
			at++;
		}
	}

}
