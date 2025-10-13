import java.util.Scanner;

public class ATV1_Divisores_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n, d, q;
        
        System.out.print("Digite um número inteiro: ");
        n = ler.nextInt();
        
        System.out.println("Divisores de " + n + ":");

        for (d = 1; d <= n; d++) {
            q = n / d; // 

            if (q * d == n) {
                System.out.println(d);
            }
        }
    }
}
