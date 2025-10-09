import java.util.Scanner;

public class media {
    public static void main(String [] args){ 
        Scanner input = new Scanner(System.in);
        double x, y;

        System.out.print("Digite um numero: ");
        x = input.nextInt();

        System.out.print("Digite outro numero: ");
        y = input.nextInt();
        
        System.out.println("Media: " + (x+y)/2);//media entre dois numeros x e y
    }
}