package lista1sc;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Curso: ");
        String curso = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.println("==============================\nAluno: " + nome + "\nCurso: " + curso
                + "\nIdade: " + idade + " anos\n==============================");
        sc.close();
    }
}
