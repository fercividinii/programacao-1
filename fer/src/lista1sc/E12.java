package lista1sc;

import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        String resultado = idade >= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado);
        sc.close();
    }
}
