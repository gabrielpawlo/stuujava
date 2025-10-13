public class ATV1_Recursividade_3 {

    public static int somaRecursiva(int[] numeros, int tamanho) {
        if (tamanho == 0) {
            return 0;
        }
        return numeros[tamanho - 1] + somaRecursiva(numeros, tamanho - 1);
    }

    public static void main(String[] args) {
        int[] lista = {2, 4, 3, 8, 3, 1, 3, 5, 3, 8};
        int tamanho = lista.length;

        int resultado = somaRecursiva(lista, tamanho);
        System.out.println("Soma dos elementos: " + resultado);
    }
}
