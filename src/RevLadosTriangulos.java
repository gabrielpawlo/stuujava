import java.util.Scanner;

public class RevLadosTriangulos {
        public static void main(String[] args) {
        double a = 0, b = 0, c =0;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite o primeiro lado: ");
        a = ler.nextDouble();
        System.out.printf("Digite o segundo lado: ");
        b = ler.nextDouble();
        System.out.printf("Digite o terceiro lado: ");
        c = ler.nextDouble();

        if((a < b + c) && (b < a + c) && (c < a + b)){
            if (a == b && a == c ) {
                System.out.println("Triangulo Equilatero");
            } else if((a == b && a != c) || (a == c && a != b) || (b == c && b != a)){
                System.out.println("Triangulo isoceles");
            } else {
                System.out.println("Triangulo escaleno");
            }
        }
    }
}