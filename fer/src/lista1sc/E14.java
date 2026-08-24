package lista1sc;

import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Salário: ");
        double salario = sc.nextDouble();
        System.out.print("Tempo de empresa em anos: ");
        int tempoEmpresa = sc.nextInt();
        double bonus = tempoEmpresa >= 5 ? 500 : 0;
        System.out.println("Nome: " + nome + "\nSalário: R$ " + salario + "\nBônus: R$ "
                + bonus + "\nSalário Final: R$ " + (salario + bonus));
        sc.close();
    }
}
