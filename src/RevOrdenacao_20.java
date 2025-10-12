import java.util.Scanner;

public class RevOrdenacao_20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("\nNúmeros ordenados em ordem decrescente:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}