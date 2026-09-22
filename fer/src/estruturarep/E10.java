package estruturarep;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int quantidade = 0;
        String resposta;
        do {
            System.out.print("Nome do aluno: ");
            String nome = sc.nextLine();
            System.out.print("Nota de " + nome + ": ");
            double nota = sc.nextDouble();
            sc.nextLine();
            soma = soma + nota;
            quantidade++;
            System.out.print("Deseja cadastrar outro aluno? (S/N): ");
            resposta = sc.nextLine();
        } while (resposta.equalsIgnoreCase("S"));
        System.out.println("Média das notas: " + (soma / quantidade));
        sc.close();
    }
}
