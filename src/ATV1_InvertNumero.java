import java.util.Scanner;

public class ATV1_InvertNumero {
    static void invertNumero(int num){
        int nB = num;
        int resto = 0;
        int nInvert1 = 0;

        while(nB % 10 > 0){
            resto = nB % 10;
            nInvert1 = (nInvert1 * 10) + resto;
            nB = nB / 10;

            System.out.println(nB + " - " + resto);
    }

    System.out.println("Numero invertido: " + nInvert1);
}
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 0, resultado = 0;;

        System.out.printf("Digite: ");
        n = ler.nextInt();

        invertNumero(n);
    }
}
