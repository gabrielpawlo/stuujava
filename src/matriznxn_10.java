import java.util.Scanner;

public class matriznxn_10 {
    public static void main(String[] args) {
        int n = 0;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite a ordem da matriz: ");
        n = ler.nextInt();

        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf(" Elemento %d: %d ", i+1, j+1);
            }
            System.out.println();
        }
    }
}