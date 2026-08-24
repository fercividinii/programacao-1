package at4;

import java.util.Scanner;

public class E8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int temp, c=0, f=0;
		System.out.println("Digite 1 = Celsius para Fahrenheit 2 = Fahrenheit para Celsius 3 = Celsius para Kelvin");
		temp = leia.nextInt();
		
		if (temp==1 || temp==3) {
			System.out.println("Digite a temperatura em Celsius");
			c = leia.nextInt();
		}else if(temp==2) {
			System.out.println("Digite a temperatura em Fahrenheit");
			f = leia.nextInt();
		}
		switch (temp) {
		case 1:
			System.out.println((c*9/5) + 32);
			break;
		case 2:
			System.out.println((f-32)*5/9);
			break;
		case 3:
			System.out.println(c+273.15);
			break;
			default:
				System.out.println("Digite um numero certo but");
		}
		

	}

}
