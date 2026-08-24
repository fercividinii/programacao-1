package switchc;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o turno (1-Manhã ou 2-Tarde): ");
        int turno = sc.nextInt();
        System.out.print("Digite o código da disciplina (1, 2 ou 3): ");
        int disciplina = sc.nextInt();

        switch (turno) {
            case 1:
                switch (disciplina) {
                    case 1: System.out.println("Matemática"); break;
                    case 2: System.out.println("Português"); break;
                    case 3: System.out.println("Física"); break;
                    default: System.out.println("Disciplina inválida.");
                }
                break;
            case 2:
                switch (disciplina) {
                    case 1: System.out.println("História"); break;
                    case 2: System.out.println("Geografia"); break;
                    case 3: System.out.println("Biologia"); break;
                    default: System.out.println("Disciplina inválida.");
                }
                break;
            default:
                System.out.println("Turno inválido.");
        }

        sc.close();
    }
}
