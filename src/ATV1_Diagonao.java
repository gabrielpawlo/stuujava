import java.util.Scanner;

public class ATV1_Diagonao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;

        System.out.print("Digite o tamanho da matriz: ");
        n = ler.nextInt();
        
        System.out.println("Posições na e abaixo da diagonal:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.printf("%d,%d\t", i + 1, j + 1);
            }
            System.out.println();
        }
    }
}