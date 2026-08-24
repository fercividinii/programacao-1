package lista1;

public class E14 {
    public static void main(String[] args) {
        String nome = "Carlos";
        double salario = 2500;
        int tempoEmpresa = 6;
        double bonus = tempoEmpresa >= 5 ? 500 : 0;
        double salarioFinal = salario + bonus;
        System.out.println("Nome: " + nome + "\nSalário: R$ " + salario
                + "\nBônus: R$ " + bonus + "\nSalário Final: R$ " + salarioFinal);
    }
}
