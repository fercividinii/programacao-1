package lista2sc;
import java.util.Scanner;
public class E14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Está chovendo (true/false)? "); boolean chovendo = sc.nextBoolean();
        System.out.print("Possui guarda-chuva (true/false)? "); boolean guardaChuva = sc.nextBoolean();
        System.out.print("Há carro disponível (true/false)? "); boolean carroDisponivel = sc.nextBoolean();
        System.out.println(chovendo && guardaChuva);
        System.out.println(guardaChuva || carroDisponivel);
        System.out.println(!chovendo);
        System.out.println(chovendo && (guardaChuva || carroDisponivel));
        System.out.println(!(chovendo && guardaChuva));
        sc.close();
    }
}
