import java.util.Scanner;

public class RevOcorrenciaValorVetor_28{

    public static int contarOcorrencias(int[] vetor, int tamanho, int chave) {
        int contador = 0;
        
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == chave) {
                contador++;
            }
        }
        
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TAMANHO_VETOR = 20;
        int[] meuVetor = new int[TAMANHO_VETOR];

        System.out.println("Por favor, insira 20 números inteiros para o vetor:");
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            meuVetor[i] = scanner.nextInt();
        }

        System.out.print("\nAgora, digite o número que você deseja pesquisar no vetor: ");
        int chavePesquisa = scanner.nextInt();

        int numeroOcorrencias = contarOcorrencias(meuVetor, TAMANHO_VETOR, chavePesquisa);

        System.out.println("\nO número " + chavePesquisa + " aparece " + numeroOcorrencias + " vez(es) no vetor.");
        
        scanner.close();
    }
}