package lista2sc;
import java.util.Scanner;
public class E19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saldo: "); double saldo = sc.nextDouble();
        String situacao = saldo > 0 ? "Saldo positivo" : "Saldo negativo";
        System.out.println("Saldo: R$ " + saldo + "\nSituação: " + situacao);
        sc.close();
    }
}
