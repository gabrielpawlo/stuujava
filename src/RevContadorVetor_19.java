import java.util.Scanner;

public class RevContadorVetor_19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vet = new int[20];
        int num = 0, cont = 0;

        for(int i = 0; i < vet.length; i++){
            System.out.println("Elemento " + (i + 1));
            vet[i] = ler.nextInt();
        }

        System.out.println("Digite o numero: ");
        num = ler.nextInt();

        for(int i = 0; i < vet.length; i++){
            if(vet[i] == num){
                cont++;
            }
        }
        System.out.println(cont + " Vezes");

    }
}