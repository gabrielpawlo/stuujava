import java.util.Scanner;

public class CalculosRetangulo {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    double base, altura, perimetro, area, diagonal;

    System.out.print("Digite a base do retangulo: ");
    base = ler.nextInt();
    System.out.print("Digite a altura do retangulo: ");
    altura = ler.nextInt();

    perimetro = (2*base) + (2 * altura);
    area = base * altura;
    diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    //sqrt -> raiz | pow -> potencia

    System.out.print("perimetro do retangulo: " + perimetro);
    System.out.print("\narea do retangulo: " + area);
    System.out.print("\ndiagonal do retangulo: " + diagonal + "\n");
    }
}
