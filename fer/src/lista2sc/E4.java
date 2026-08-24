package lista2sc;
import java.util.Scanner;
public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: "); double nota1 = sc.nextDouble();
        System.out.print("Nota 2: "); double nota2 = sc.nextDouble();
        System.out.print("Nota 3: "); double nota3 = sc.nextDouble();
        double soma = nota1 + nota2 + nota3;
        System.out.println("Soma das notas: " + soma + "\nMédia final: " + (soma / 3));
        sc.close();
    }
}
