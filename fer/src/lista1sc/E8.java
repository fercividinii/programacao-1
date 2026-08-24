package lista1sc;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numA = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int numB = sc.nextInt();
        if (numB != 0) {
            System.out.println("Divisão inteira: " + (numA / numB));
            System.out.println("Divisão real: " + ((double) numA / numB));
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
        sc.close();
    }
}
