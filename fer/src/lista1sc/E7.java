package lista1sc;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();
        int salarioInteiro = (int) salario;
        double salarioConvertido = (double) salarioInteiro;
        System.out.println("Salário original: " + salario + "\nSalário inteiro: " + salarioInteiro
                + "\nSalário convertido: " + salarioConvertido);
        sc.close();
    }
}
