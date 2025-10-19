import java.util.Scanner;

public class RevContatenarVetor_17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] v3 = new int[10];
        int j = 0;
    
        for(int i = 0; i < 5; i++){
                System.out.println("Vetor 1 elemento" + (i + 1) + ": ");
                v1[i] = ler.nextInt();
                System.out.println("Vetor 2 elemento" + (i + 1) + ": ");
                v2[i] = ler.nextInt();
        }
            
        for(int i = 0; i < 10; i++){
            if(i < 5){
                v3[i] = v1[i];
            } else {
                v3[i] = v2[j];
                j++;
            }
        }

        for(int i = 0; i < 10; i++){
            System.out.println(" - " + v3[i]);
        }
    }
}
