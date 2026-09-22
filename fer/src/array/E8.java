package array;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] estoque = new int[3][4];
        int estoqueTotal = 0;
        int maiorEstoque = 0;
        int produtoMaior = 0;

        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {
                System.out.print("Digite o estoque do produto " + (i + 1) +
                        ", periodo " + (j + 1) + ": ");
                estoque[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < estoque.length; i++) {
            int totalProduto = 0;

            for (int j = 0; j < estoque[i].length; j++) {
                totalProduto += estoque[i][j];
            }

            estoqueTotal += totalProduto;

            System.out.println("Produto " + (i + 1) + ": " + totalProduto + " unidades");

            if (i == 0 || totalProduto > maiorEstoque) {
                maiorEstoque = totalProduto;
                produtoMaior = i + 1;
            }
        }

        System.out.println("Estoque total: " + estoqueTotal + " unidades");
        System.out.println("Maior estoque acumulado: Produto " + produtoMaior);

        sc.close();
    }
}