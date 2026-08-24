package lista2sc;
import java.util.Scanner;
public class E17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade em estoque: "); int estoque = sc.nextInt();
        String situacao = estoque < 5 ? "Estoque baixo" : "Estoque suficiente";
        System.out.println(situacao);
        sc.close();
    }
}
