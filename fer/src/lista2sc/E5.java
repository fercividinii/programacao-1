package lista2sc;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura em Celsius: "); double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C equivalem a " + fahrenheit + "°F");
        sc.close();
    }
}
