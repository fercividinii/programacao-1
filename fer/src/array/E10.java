package array;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[5][4];
        double maiorMedia = 0;
        double menorMedia = 0;
        int alunoMaior = 0;
        int alunoMenor = 0;
        double somaGeral = 0;
        int aprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Digite a nota do aluno " + (i + 1) +
                        ", avaliacao " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\nNotas e medias:");

        for (int i = 0; i < notas.length; i++) {
            double somaAluno = 0;

            System.out.print("Aluno " + (i + 1) + ": ");

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
                somaAluno += notas[i][j];
                somaGeral += notas[i][j];
            }

            double mediaAluno = somaAluno / notas[i].length;
            System.out.println("- Media: " + mediaAluno);

            if (i == 0 || mediaAluno > maiorMedia) {
                maiorMedia = mediaAluno;
                alunoMaior = i + 1;
            }

            if (i == 0 || mediaAluno < menorMedia) {
                menorMedia = mediaAluno;
                alunoMenor = i + 1;
            }

            if (mediaAluno >= 7.0) {
                aprovados++;
            }
        }

        double mediaTurma = somaGeral / (notas.length * notas[0].length);

        System.out.println("Maior media: Aluno " + alunoMaior + " - " + maiorMedia);
        System.out.println("Menor media: Aluno " + alunoMenor + " - " + menorMedia);
        System.out.println("Media da turma: " + mediaTurma);
        System.out.println("Alunos aprovados: " + aprovados);

        System.out.println("\nExibicao utilizando for-each:");

        for (double[] aluno : notas) {
            for (double nota : aluno) {
                System.out.print(nota + " ");
            }
            System.out.println();
        }

        // No for-each foi possivel exibir os valores sem controlar os indices.
        // O indice foi necessario na primeira versao para identificar cada aluno.

        sc.close();
    }
}