package lista2sc;
import java.util.Scanner;
public class E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distância em quilômetros: "); double quilometros = sc.nextDouble();
        System.out.println("Distância em metros: " + (quilometros * 1000));
        sc.close();
    }
}
