package array;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int soma = 0;
        int maior;
        int menor;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        maior = matriz[0][0];
        menor = matriz[0][0];

        System.out.println("\nMatriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                soma += matriz[i][j];

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }

            System.out.println();
        }

        int quantidade = matriz.length * matriz[0].length;
        double media = (double) soma / quantidade;

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);

        sc.close();
    }
}