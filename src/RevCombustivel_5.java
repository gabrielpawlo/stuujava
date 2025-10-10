import java.util.Scanner;

public class RevCombustivel_5{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double precoGasolina = 0, precoAlcool = 0, resultado = 0;

        System.out.printf("Digite o preco da gasolina: ");
        precoGasolina = ler.nextDouble();
        System.out.printf("Digite o preco do alcool: ");
        precoAlcool = ler.nextDouble();

        resultado = (precoAlcool/precoGasolina);

        if(resultado <= 0.7){
            System.out.println("Alcool mais vantajoso");
        } else {
            System.out.println("Gasolina mais vantajosa\n");
        }
    }
}