package atividades2;

import java.util.Scanner;

public class E20 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idd1, idd2;
		
		System.out.println("Informe a primeira idade : ");
		idd1 = leia.nextInt();
		System.out.println("Informe a segunda idade : ");
		idd2 = leia.nextInt();
		
		int d = (idd1-idd2);
		if (d < 0) {
			d = d * -1;
		}
		
		if (d > 10) {
			System.out.println("Grande diferença");
		} else if (d >= 5){
			System.out.println("Diferença moderada");
		} else {
			System.out.println("Idades próximas");
		}

	}

}
