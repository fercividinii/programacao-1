package array;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        System.out.println("\nNotas informadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
        }

        double media = soma / notas.length;
        System.out.println("Media da turma: " + media);

        sc.close();
    }
}