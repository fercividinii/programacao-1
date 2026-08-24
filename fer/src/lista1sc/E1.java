package lista1sc;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Sexo (M/F): ");
        char sexo = sc.next().charAt(0);
        System.out.print("Matrícula ativa (true/false): ");
        boolean matriculaAtiva = sc.nextBoolean();
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura
                + "\nPeso: " + peso + "\nSexo: " + sexo + "\nMatrícula ativa: " + matriculaAtiva);
        sc.close();
    }
}
