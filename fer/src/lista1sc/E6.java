package lista1sc;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor do monitor em dólares: ");
        double valorEmDolares = sc.nextDouble();
        System.out.print("Cotação do dólar: ");
        double cotacaoDolar = sc.nextDouble();
        double valorEmReais = valorEmDolares * cotacaoDolar;
        System.out.println("O monitor custa " + valorEmReais + " reais");
        sc.close();
    }
}
