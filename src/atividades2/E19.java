package atividades2;

import java.util.Scanner;

public class E19 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int h;
		
		System.out.println("Informe um horario entre 0 e 23 : ");
		h = leia.nextInt();
		
		if (h >= 5 && h <= 11) {
			System.out.println("manha");
		} else if (h >= 12 && h <= 17) {
			System.out.println("tarde");
		} else if (h >= 18 && h <= 23) {
			System.out.println("noite");
		} else {
			System.out.println("madrugada");
		}
	}

}
