package lista2;

public class E21 {
    public static void main(String[] args) {
        String nome = "João Gomes";
        double salarioBase = 2500, valorHoraExtra = 35;
        int horasExtras = 8;
        double valorHorasExtras = horasExtras * valorHoraExtra;
        double salarioFinal = salarioBase + valorHorasExtras;
        System.out.println("Nome: " + nome + "\nSalário base: R$ " + salarioBase
                + "\nValor das horas extras: R$ " + valorHorasExtras + "\nSalário final: R$ " + salarioFinal);
    }
}
