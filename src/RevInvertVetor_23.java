import java.util.Scanner;

public class RevInvertVetor_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];

        System.out.println("Digite os " + tamanho + " números inteiros:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("\nVetor Original:");
        imprimirVetor(vetor);

        for (int i = 0; i < vetor.length / 2; i++) {
            int indiceFinal = vetor.length - 1 - i;
            
            int temp = vetor[i];
            vetor[i] = vetor[indiceFinal];
            vetor[indiceFinal] = temp;
        }

        System.out.println("\nVetor Invertido:");
        imprimirVetor(vetor);

        scanner.close();
    }
    
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}