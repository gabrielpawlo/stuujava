import java.util.Scanner;

public class RevFuncaoAreaCirculo_24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double raio = 0, area = 0;

        System.out.printf("Digite o raio do circulo: ");
        raio = ler.nextDouble();

        System.out.println("Area do circulo: " + AreaCirculo(raio));
        System.out.println("Diametro do circulo: " + DiametroCirculo(raio));
        System.out.println("Perimetro do circulo: " + PerimetroCirculo(raio));
    }
    public static double AreaCirculo(double raio){
        return 3.14 * (raio * raio);
    }

    public static double DiametroCirculo(double raio){
        return raio * 2;
    }

    public static double PerimetroCirculo(double raio){
        return 2 * 3.14 * raio;
    }
}