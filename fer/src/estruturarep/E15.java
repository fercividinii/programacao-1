package estruturarep;

import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        for (int contador = 1; contador <= 5; contador++) {
            System.out.print("Digite a " + contador + "ª nota: ");
            double nota = sc.nextDouble();
            soma = soma + nota;
        }
        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + (soma / 5));
        sc.close();
    }
}
