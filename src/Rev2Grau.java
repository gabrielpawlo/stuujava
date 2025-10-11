import java.util.Scanner;

public class Rev2Grau {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double a = 0, b = 0, c = 0;

        System.out.printf("Digite o coeficiente a: ");
        a = leitura.nextDouble();
        System.out.printf("Digite o coeficiente b: ");
        b = leitura.nextDouble();        
        System.out.printf("Digite o coeficiente c: ");
        c = leitura.nextDouble();

        double delta = Math.pow(b,2)+4*a*c;
        if(delta > 0){
            double x1 = (-b+delta)/(2*a);
            double x2 = (-b-delta)/(2*a);

            System.out.println("Raizes das equacoes: " + x1 + " e " + x2);
        } else if (delta == 0) {
            double x = -b/(2*a);
            System.out.println("Raiz da equacao: " + x);
        } else {
            System.out.println("Suas raizes nao existe");
        }
    }
}