package lista1sc;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int numero2 = sc.nextInt();
        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println("Subtração: " + (numero1 - numero2));
        System.out.println("Multiplicação: " + (numero1 * numero2));
        if (numero2 != 0) {
            System.out.println("Divisão: " + ((double) numero1 / numero2));
            System.out.println("Resto: " + (numero1 % numero2));
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
        sc.close();
    }
}
