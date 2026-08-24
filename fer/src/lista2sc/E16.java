package lista2sc;
import java.util.Scanner;
public class E16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Funcionário: "); String funcionario = sc.nextLine();
        System.out.print("Cargo: "); String cargo = sc.nextLine();
        System.out.print("Salário: "); double salario = sc.nextDouble();
        System.out.println("*************************\nFuncionário: " + funcionario + "\nCargo: " + cargo
                + "\nSalário: R$ " + salario + "\n*************************");
        sc.close();
    }
}
