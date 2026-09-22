package array;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] valores = new double[10];
        double soma = 0;
        double maior;
        double menor;
        int acimaDaMedia = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = sc.nextDouble();
            soma += valores[i];
        }

        maior = valores[0];
        menor = valores[0];

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }

            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        double media = soma / valores.length;

        for (double valor : valores) {
            if (valor > media) {
                acimaDaMedia++;
            }
        }

        System.out.println("\nValores:");
        for (double valor : valores) {
            System.out.print(valor + " ");
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("Media: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Quantidade acima da media: " + acimaDaMedia);

        // No for-each nao foi necessario controlar o indice,
        // pois apenas os valores foram utilizados.

        sc.close();
    }
}