package lista2sc;
import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: "); String nome = sc.nextLine();
        System.out.print("Idade: "); int idade = sc.nextInt(); sc.nextLine();
        System.out.print("Curso: "); String curso = sc.nextLine();
        System.out.print("Altura: "); double altura = sc.nextDouble();
        System.out.print("Média final: "); double media = sc.nextDouble();
        System.out.print("Está matriculado (true/false)? "); boolean matriculado = sc.nextBoolean();
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCurso: " + curso + "\nAltura: "
                + altura + "\nMédia final: " + media + "\nMatriculado: " + matriculado);
        sc.close();
    }
}
