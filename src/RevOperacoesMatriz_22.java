import java.util.Scanner;

public class RevOperacoesMatriz_22 {
    public static void preencherMatriz(int[][] matriz, Scanner ler) {
        System.out.println("Preenchendo a matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite o valor para [%d][%d]: ", i, j);
                matriz[i][j] = ler.nextInt();
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int[][] matrizR = new int[4][4];
        String operacao;
        preencherMatriz(matriz1, ler);
        preencherMatriz(matriz2, ler);

        do {
            System.out.println("\nEscolha uma operacao:");
            System.out.println("[1] Somar matrizes");
            System.out.println("[2] Subtrair matrizes");
            System.out.println("[3] Calcular a diagonal principal");
            System.out.println("[4] Sair");
            System.out.print("Sua escolha: ");
            operacao = ler.next();

            switch (operacao) {
                case "1":
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            matrizR[i][j] = matriz1[i][j] + matriz2[i][j];
                        }
                    }
                    System.out.println("Resultado da soma:");
                    imprimirMatriz(matrizR);
                    break;

                case "2":
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            matrizR[i][j] = matriz1[i][j] - matriz2[i][j];
                        }
                    }
                    System.out.println("Resultado da subtracao:");
                    imprimirMatriz(matrizR);
                    break;

                case "3":
                    System.out.println("Qual matriz? [1] ou [2]?");
                    int opcao = ler.nextInt();
                    
                    System.out.println("Diagonal principal da matriz " + opcao + ":");
                    if (opcao == 1) {
                        for (int i = 0; i < 4; i++) {
                            System.out.println(matriz1[i][i]);
                        }
                    } else if (opcao == 2) {
                        for (int i = 0; i < 4; i++) {
                            System.out.println(matriz2[i][i]);
                        }
                    } else {
                        System.out.println("Opcao invalida.");
                    }
                    break;

                case "4":
                    System.out.println("Saindo do programa. Tchau!");
                    break;

                default:
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }
        } while (!operacao.equals("4"));
    }
}