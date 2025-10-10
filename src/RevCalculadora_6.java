import java.util.Scanner;

public class RevCalculadora_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double x = 0, y = 0;

        System.out.printf("Digite o X: ");
        x = ler.nextInt();
        System.out.printf("Digite o Y: ");
        y = ler.nextInt();

        System.out.println("Digite a operacao (+, -, *, %) ou '0' para sair: ");
        String operacao = ler.next();

        switch (operacao) {
            case "+":
                Soma(x, y);
                break;
            case "-":
                Subtracao(x, y);
                break;
            case "*":
                Multiplicacao(x, y);
                break;
            case "%":
                Divisao(x, y);
                break;
            default:
                System.out.println("Operacao " + operacao + "Invalida");
        }
    }
    public static void Soma(double x, double y){
        System.out.println("Resultado: " + x+y);
    }

    public static void Subtracao(double x, double y){
        System.out.println("Resultado: " + (x-y));
    }

    public static void Multiplicacao(double x, double y){
        System.out.println("Resultado: " + (x*y));
    }

    public static void Divisao(double x, double y){
        if (y == 0) {
            System.out.println("Nao existe divisao por 0");
        } else {
            System.out.println("Resultado: " + (x/y));
        }
    }
}