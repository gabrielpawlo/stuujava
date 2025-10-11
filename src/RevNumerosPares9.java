import java.util.Scanner;

public class RevNumerosPares9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0)
            {
                System.out.println("- " + i);
            }
        }
    }
}