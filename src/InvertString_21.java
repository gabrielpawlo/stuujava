import java.util.Scanner;

public class InvertString_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        frase = frase.toLowerCase();//minusculo
        int espacos = 0;
        int vogais = 0;
        int consoantes = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);

            if (caractere == ' ') {
                espacos++;
            } else if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                vogais++;
            } else if (caractere >= 'a' && caractere <= 'z') {
                consoantes++;
            }
        }

        System.out.println("\n--- Contagem ---");
        System.out.println("Espacos em branco: " + espacos);
        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);

        scanner.close();
    }
}