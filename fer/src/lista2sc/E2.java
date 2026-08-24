package lista2sc;
import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Marca: "); String marca = sc.nextLine();
        System.out.print("Modelo: "); String modelo = sc.nextLine();
        System.out.print("Ano de fabricação: "); int ano = sc.nextInt(); sc.nextLine();
        System.out.print("Cor: "); String cor = sc.nextLine();
        System.out.print("Valor: "); double valor = sc.nextDouble();
        System.out.print("É automático (true/false)? "); boolean automatico = sc.nextBoolean();
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nCor: "
                + cor + "\nValor: R$ " + valor + "\nAutomático: " + automatico);
        sc.close();
    }
}
