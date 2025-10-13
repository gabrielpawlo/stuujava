public class ATV1_SomaV_4 {

    public static int somaPositivos(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        int numero = 6;
        System.out.println("Soma de todos os valores até " + numero + " = " + somaPositivos(numero));
    }
}
