package lista2;

public class E22 {
    public static void main(String[] args) {
        String produto = "Notebook";
        double valorUnitario = 1250;
        int quantidade = 2, parcelas = 5;
        double valorTotal = valorUnitario * quantidade;
        double valorParcela = valorTotal / parcelas;
        System.out.println("Produto: " + produto + "\nValor unitário: R$ " + valorUnitario
                + "\nQuantidade: " + quantidade + "\nValor total: R$ " + valorTotal
                + "\nParcelas: " + parcelas + "\nValor de cada parcela: R$ " + valorParcela);
    }
}
