package estruturarep;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numero = 0;
        while (numero >= 0) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            if (numero >= 0) {
                soma = soma + numero;
            }
        }
        System.out.println("Soma = " + soma);
        sc.close();
    }
}
