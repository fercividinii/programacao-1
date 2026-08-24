package at3;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int quant = 0;
		double soma = 0, n =0, limite;
		
		System.out.println("Digite o valor-limite");
		limite = leia.nextDouble();
		
		while (soma < limite) {
		System.out.println("Digite um numero positivo");
		n = leia.nextDouble();
		
		if (n > 0) {
			soma +=n;
			quant++;
		}else {
			System.out.println("Numero invalido, digite um positivo");
		}
		
	}
		
		System.out.println("Quant de numeros digitados: "+quant);
		System.out.println("Soma final: "+soma);
		System.out.println("ultimo numero digitado "+n);
	}
}
