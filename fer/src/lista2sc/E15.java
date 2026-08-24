package lista2sc;
import java.util.Scanner;
public class E15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Produto: "); String produto = sc.nextLine();
        System.out.print("Preço: "); double preco = sc.nextDouble();
        System.out.print("Estoque: "); int estoque = sc.nextInt();
        System.out.println("=========================\nProduto: " + produto + "\nPreço: R$ " + preco
                + "\nEstoque: " + estoque + " unidades\n=========================");
        sc.close();
    }
}
