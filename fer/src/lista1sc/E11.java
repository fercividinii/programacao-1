package lista1sc;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        String nomeAluno = sc.nextLine();
        System.out.print("Nota: ");
        int nota = sc.nextInt();
        System.out.print("Frequência: ");
        int frequencia = sc.nextInt();
        String resultado = (nota >= 7 && frequencia >= 75) ? "Aprovado" : "Reprovado";
        System.out.println(nomeAluno + ": " + resultado);
        sc.close();
    }
}
