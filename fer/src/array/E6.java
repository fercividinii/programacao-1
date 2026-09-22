package array;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[3][4];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Digite a nota do aluno " + (i + 1) +
                        ", avaliacao " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\nNotas dos alunos:");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}