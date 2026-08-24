package lista2sc;
import java.util.Scanner;
public class E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura: "); double temperatura = sc.nextDouble();
        int temperaturaInteira = (int) temperatura;
        double temperaturaConvertida = (double) temperaturaInteira;
        System.out.println("Original: " + temperatura + "\nInteira: " + temperaturaInteira
                + "\nConvertida para double: " + temperaturaConvertida);
        sc.close();
    }
}
