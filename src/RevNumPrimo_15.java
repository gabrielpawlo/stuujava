import java.util.Scanner;

public class RevNumPrimo_15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 0, count = 0;

        System.out.printf("Digite um numero: ");
        num = ler.nextInt();

        for(int i = 2; i <= num ; i++){
            if(num % 2 == 0){
                count++;
            }
        }
        if(count > 2){
            System.out.println("Nao primo");
        } else{
            System.out.println("Primo");
        }
    }
}