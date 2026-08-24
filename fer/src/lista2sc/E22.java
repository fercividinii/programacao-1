package lista2sc;
import java.util.Scanner;
public class E22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do produto: "); String produto = sc.nextLine();
        System.out.print("Valor unitário: "); double valorUnitario = sc.nextDouble();
        System.out.print("Quantidade: "); int quantidade = sc.nextInt();
        System.out.print("Quantidade de parcelas: "); int parcelas = sc.nextInt();
        double valorTotal = valorUnitario * quantidade;
        if (parcelas != 0) {
            double valorParcela = valorTotal / parcelas;
            System.out.println("Produto: " + produto + "\nValor unitário: R$ " + valorUnitario
                    + "\nQuantidade: " + quantidade + "\nValor total: R$ " + valorTotal
                    + "\nParcelas: " + parcelas + "\nValor de cada parcela: R$ " + valorParcela);
        } else System.out.println("A quantidade de parcelas não pode ser zero.");
        sc.close();
    }
}
