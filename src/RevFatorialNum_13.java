import java.util.Scanner;

public class RevFatorialNum_13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 0, fatorial = 1, fat = 0;

        System.out.printf("Digite um numero: ");
        num = ler.nextInt();

        for(int i = num; i > 0; i--){//5 * 4 * 3 * 2 * 1
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
