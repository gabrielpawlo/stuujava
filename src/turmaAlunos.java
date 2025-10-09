import java.util.Scanner;

public class TurmaAlunos {
    public static void main(String[] args){
        double notas[]= new double[10];
        double media = 0, desvio = 0, soma = 0;
        Scanner ler = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.println("Digite a nota do Aluno " + (i + 1));
            notas[i] = ler.nextDouble();
            soma += notas[i];
        }
        media = soma / notas.length;
        System.out.println(media);
    }
}

static int CalcularDesvio(){
    return 0;
}