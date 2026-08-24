package lista2sc;
import java.util.Scanner;
public class E9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de x: "); int x = sc.nextInt();
        System.out.print("Valor de y: "); int y = sc.nextInt();
        if (y != 0) {
            System.out.println("Divisão inteira: " + (x / y));
            System.out.println("Divisão real: " + ((double) x / y));
        } else System.out.println("Não é possível dividir por zero.");
        sc.close();
    }
}
