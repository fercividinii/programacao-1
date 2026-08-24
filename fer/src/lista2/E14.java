package lista2;

public class E14 {
    public static void main(String[] args) {
        boolean chovendo = true, guardaChuva = false, carroDisponivel = true;
        System.out.println(chovendo && guardaChuva); 
        System.out.println(guardaChuva || carroDisponivel); 
        System.out.println(!chovendo); 
        System.out.println(chovendo && (guardaChuva || carroDisponivel));
        System.out.println(!(chovendo && guardaChuva));
    }
}
