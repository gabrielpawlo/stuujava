import java.util.Scanner;

public class RevIntervaloMult_11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int limiteinf = 0, limitesup = 0, numero = 0, resultado = 0;

        System.out.printf("Limite inferior: ");
        limiteinf = ler.nextInt();
        System.out.printf("Limite superior: ");
        limitesup = ler.nextInt();
        System.out.printf("Numero: ");
        numero = ler.nextInt();
        for(int i = 1; i < limitesup; i++){
            resultado = numero * i;
            //System.out.println(resultado);
            if(resultado > limiteinf && resultado < limitesup){
                System.out.println("resultado: " + resultado);
            }
        }
    }
}