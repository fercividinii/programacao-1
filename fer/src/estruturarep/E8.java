package estruturarep;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        int soma = 0;
        do {
            System.out.print("Digite o " + contador + "º número: ");
            int numero = sc.nextInt();
            soma = soma + numero;
            contador++;
        } while (contador <= 5);
        System.out.println("Soma = " + soma);
        sc.close();
    }
}
