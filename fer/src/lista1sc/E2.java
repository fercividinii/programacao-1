package lista1sc;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Código: ");
        int codigo = sc.nextInt();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = sc.nextInt();
        System.out.println("Produto: " + nome + "\nCódigo: " + codigo + "\nPreço: R$ "
                + preco + "\nQuantidade em estoque: " + quantidade);
        sc.close();
    }
}
