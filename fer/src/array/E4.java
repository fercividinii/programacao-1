package array;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[15];
        int pares = 0;
        int impares = 0;
        int maioresQue10 = 0;
        int menoresOuIguais10 = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (numeros[i] > 10) {
                maioresQue10++;
            } else {
                menoresOuIguais10++;
            }
        }

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de impares: " + impares);
        System.out.println("Maiores que 10: " + maioresQue10);
        System.out.println("Menores ou iguais a 10: " + menoresOuIguais10);

        sc.close();
    }
}