package lista2sc;
import java.util.Scanner;
public class E7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota: "); double nota = sc.nextDouble();
        int notaInteira = (int) nota;
        double notaConvertida = (double) notaInteira;
        System.out.println("Nota original: " + nota + "\nNota inteira: " + notaInteira
                + "\nNota convertida para double: " + notaConvertida);
        sc.close();
    }
}
