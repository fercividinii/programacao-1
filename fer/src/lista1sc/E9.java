package lista1sc;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Possui ingresso (true/false)? ");
        boolean possuiIngresso = sc.nextBoolean();
        System.out.print("Possui documento (true/false)? ");
        boolean possuiDocumento = sc.nextBoolean();
        System.out.print("Acompanhante é maior de idade (true/false)? ");
        boolean acompanhanteMaiorIdade = sc.nextBoolean();
        System.out.println(possuiIngresso && possuiDocumento);
        System.out.println(possuiIngresso || possuiDocumento);
        System.out.println(!possuiDocumento);
        System.out.println(possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade));
        System.out.println(!(possuiIngresso && possuiDocumento));
        sc.close();
    }
}
