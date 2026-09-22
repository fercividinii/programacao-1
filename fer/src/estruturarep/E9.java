package estruturarep;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Excluir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
        } while (opcao != 0);
        System.out.println("Programa encerrado.");
        sc.close();
    }
}
