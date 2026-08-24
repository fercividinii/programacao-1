package lista2sc;
import java.util.Scanner;
public class E18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Média: "); double media = sc.nextDouble();
        String resultado = media >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
        sc.close();
    }
}
