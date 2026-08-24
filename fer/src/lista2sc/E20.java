package lista2sc;
import java.util.Scanner;
public class E20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade: "); int idade = sc.nextInt();
        String atendimento = idade >= 60 ? "Atendimento preferencial" : "Atendimento comum";
        System.out.println("Idade: " + idade + " anos\nTipo de atendimento: " + atendimento);
        sc.close();
    }
}
