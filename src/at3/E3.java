package at3;

import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num=0,ip=0,in=0,num1;
		
		while (num<10)
		{
			System.out.println("Informe um numero");
			num1 = leia.nextInt();
			
			if (num1 >= 0) {
				ip++;
			}
			else {
				in++;
			}
			num++;
			
		}
		System.out.println("Sao "+ip+" numeros positivos");
		System.out.println("Sao "+in+" numeros negativos");

	}

}
