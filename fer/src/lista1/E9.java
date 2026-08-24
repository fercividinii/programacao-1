package lista1;

public class E9 {
    public static void main(String[] args) {
        boolean possuiIngresso = true, possuiDocumento = false, acompanhanteMaiorIdade = true;
        System.out.println(possuiIngresso && possuiDocumento); // false: não possui documento
        System.out.println(possuiIngresso || possuiDocumento); // true: possui ingresso
        System.out.println(!possuiDocumento); // true: não possui documento
        System.out.println(possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade)); // true: ingresso e acompanhante
        System.out.println(!(possuiIngresso && possuiDocumento)); // true: não possui os dois juntos
    }
}
