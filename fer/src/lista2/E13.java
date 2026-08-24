package lista2;

public class E13 {
    public static void main(String[] args) {
        boolean possuiCNH = true, possuiCarro = false, possuiDinheiro = true;
        System.out.println(possuiCNH && possuiCarro); 
        System.out.println(possuiCarro || possuiDinheiro); 
        System.out.println(!possuiCNH); 
        System.out.println(possuiCNH && possuiDinheiro); 
        System.out.println(!(possuiCarro || possuiDinheiro)); 
    }
}
