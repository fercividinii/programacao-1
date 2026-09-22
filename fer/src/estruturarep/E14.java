package estruturarep;

import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número positivo: ");
        int numero = sc.nextInt();
        int soma = 0;
        for (int contador = 1; contador <= numero; contador++) {
            soma = soma + contador;
        }
        System.out.println("Soma: " + soma);
        sc.close();
    }
}
