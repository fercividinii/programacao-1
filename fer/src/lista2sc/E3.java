package lista2sc;
import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distância percorrida em km: "); double distancia = sc.nextDouble();
        System.out.print("Litros consumidos: "); double litros = sc.nextDouble();
        if (litros != 0) {
            double consumoMedio = distancia / litros;
            System.out.println("Consumo médio: " + consumoMedio + " km/l");
            System.out.println("Litros para 100 km: " + (100 / consumoMedio));
        } else System.out.println("A quantidade de litros não pode ser zero.");
        sc.close();
    }
}
