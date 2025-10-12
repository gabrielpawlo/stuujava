import java.util.Scanner;

public class RevMatriz_16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int notas[] = new int[40];
        int cont = 0, soma = 0, media = 0;

        for(int i = 0; i < notas.length ; i++){
            System.out.printf("Diigte a nota do aluno" + (i + 1) + " : ");
            notas[i] = ler.nextInt();
            soma += notas[i];
        }
        media = soma / notas.length;
        System.out.println("Media: " + media);

        for(int i = 0; i < notas.length; i++){
            if(notas[i] < media){
                cont++;
            }
        }
        System.out.println(cont + " Alunos abaixo da media");
    }
}