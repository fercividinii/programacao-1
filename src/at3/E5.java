package at3;

import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int conteu, contp=1;
		
		System.out.println("Informe um numero");
		conteu = leia.nextInt();
		
		while (contp<conteu) {
			if (contp%3==0) {
				System.out.println(contp);
			}
			contp++;
		}

			
	}

}
