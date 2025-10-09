import java.util.Scanner;

public class turmaAlunos {
    public static void main(String[] args){
        double notas[]= new double[10];
        double media = 0, soma = 0;
        Scanner ler = new Scanner(System.in);
        turmaAlunos turma = new turmaAlunos();

        for(int i = 0; i < 10; i++){
            System.out.printf("Digite a nota do Aluno %d: ", (i + 1));
            notas[i] = ler.nextDouble();
            soma += notas[i];
        }

        media = soma / notas.length;
        System.out.println("Media: " + media);
        turma.DesvioDeCadaNota(notas, media);
        turma.DesvioDeCadaNotaAoQuadrado(notas, media);
        turma.Variancia(notas, media);
        turma.DesvioPadrao(notas, media);
    }
    
    public void DesvioDeCadaNota(double notas[], double media){
        System.out.println("\n");
        for(int i = 0; i < notas.length; i++){
            System.out.printf("Desvio da nota do aluno %d: %.2f%n", (i + 1), (notas[i] - media));
        }
        System.out.println("\n");
    }

    public void DesvioDeCadaNotaAoQuadrado(double notas[], double media){
    for(int i = 0; i < notas.length; i++){
            System.out.printf("Desvio da nota^2 do aluno %d: %.2f%n", (i + 1) , ((notas[i] - media) * (notas[i] - media)));
        }
        System.out.println("\n");
    }

    public void Variancia(double notas[], double media){
        double soma = 0;
        for(int i = 0; i < notas.length; i++){
            soma += (notas[i] - media) * (notas[i] - media);
        }
        System.out.printf("Variancia: %.2f%n", (soma / notas.length));
        System.out.println("\n");
    }

    public void DesvioPadrao(double notas[], double media){
        double soma = 0, variancia = 0;
        for(int i = 0; i < notas.length; i++){
            soma += (notas[i] - media) * (notas[i] - media);
        }
        variancia = soma/notas.length;
        System.out.printf("Desvio padrao: %.2f%n", Math.sqrt(variancia));
        System.out.println("\n");
    }
}