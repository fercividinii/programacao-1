package lista1sc;

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura: ");
        double temperatura = sc.nextDouble();
        String situacao = temperatura > 25 ? "Dia quente" : "Dia agradável";
        System.out.println("Temperatura: " + temperatura + "°C\nSituação: " + situacao);
        sc.close();
    }
}
