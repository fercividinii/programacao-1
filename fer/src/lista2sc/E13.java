package lista2sc;
import java.util.Scanner;
public class E13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Possui CNH (true/false)? "); boolean possuiCNH = sc.nextBoolean();
        System.out.print("Possui carro (true/false)? "); boolean possuiCarro = sc.nextBoolean();
        System.out.print("Possui dinheiro (true/false)? "); boolean possuiDinheiro = sc.nextBoolean();
        System.out.println(possuiCNH && possuiCarro);
        System.out.println(possuiCarro || possuiDinheiro);
        System.out.println(!possuiCNH);
        System.out.println(possuiCNH && possuiDinheiro);
        System.out.println(!(possuiCarro || possuiDinheiro));
        sc.close();
    }
}
