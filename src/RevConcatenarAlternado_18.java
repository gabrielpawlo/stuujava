import java.util.Scanner;

public class RevConcatenarAlternado_18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] v3 = new int[10];
        int j = 1;
        int x = 0;
    
        for(int i = 0; i < 5; i++){
                System.out.println("Vetor 1 elemento" + (i + 1) + ": ");
                v1[i] = ler.nextInt();
                System.out.println("Vetor 2 elemento" + (i + 1) + ": ");
                v2[i] = ler.nextInt();
        }
            
        for(int i = 0; i < 5; i++){
            v3[i * 2] = v1[i];       
            v3[i * 2 + 1] = v2[i];   
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println(" - " + v3[i]);
        }
    }
}
