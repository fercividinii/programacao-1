package lista2sc;
import java.util.Scanner;
public class E12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saldo: "); double saldo = sc.nextDouble();
        System.out.println(saldo >= 1000);
        System.out.println(saldo < 500);
        System.out.println(saldo == 850);
        System.out.println(saldo != 850);
        sc.close();
    }
}
