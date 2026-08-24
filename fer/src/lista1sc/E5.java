package lista1sc;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor do arroz: ");
        double arroz = sc.nextDouble();
        System.out.print("Valor do feijão: ");
        double feijao = sc.nextDouble();
        System.out.print("Valor do óleo: ");
        double oleo = sc.nextDouble();
        double total = arroz + feijao + oleo;
        System.out.println("Valor total: R$ " + total);
        System.out.println("Valor médio: R$ " + (total / 3));
        sc.close();
    }
}
