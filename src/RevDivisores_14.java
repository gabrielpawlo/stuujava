import java.util.Scanner; 

public class RevDivisores_14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 0;

        System.out.printf("Digite um numero: ");
        num = ler.nextInt();

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(" - " + i);
            }
        }
    }
}