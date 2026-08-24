package lista2sc;
import java.util.Scanner;
public class E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total de alunos: "); int totalAlunos = sc.nextInt();
        System.out.print("Quantidade de grupos: "); int grupos = sc.nextInt();
        if (grupos != 0) {
            System.out.println("Divisão inteira: " + (totalAlunos / grupos));
            System.out.println("Divisão real: " + ((double) totalAlunos / grupos));
        } else System.out.println("A quantidade de grupos não pode ser zero.");
        sc.close();
    }
}
