package lista2sc;
import java.util.Scanner;
public class E21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do funcionário: "); String nome = sc.nextLine();
        System.out.print("Salário base: "); double salarioBase = sc.nextDouble();
        System.out.print("Quantidade de horas extras: "); int horasExtras = sc.nextInt();
        System.out.print("Valor de cada hora extra: "); double valorHoraExtra = sc.nextDouble();
        double valorHorasExtras = horasExtras * valorHoraExtra;
        double salarioFinal = salarioBase + valorHorasExtras;
        System.out.println("Nome: " + nome + "\nSalário base: R$ " + salarioBase
                + "\nValor das horas extras: R$ " + valorHorasExtras + "\nSalário final: R$ " + salarioFinal);
        sc.close();
    }
}
