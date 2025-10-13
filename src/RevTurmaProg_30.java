import java.util.Scanner;

public class RevTurmaProg_30 {
    
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double notaFinal;

    public RevTurmaProg_30(String matricula, double n1, double n2, double n3, double n4) {//construtor
        this.matricula = matricula;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
        this.nota4 = n4;
    }

    public void calcularNotaFinal() {
        this.notaFinal = (nota1 + nota2 + nota3 + nota4) / 4.0;
    }

    public String getSituacao() {
        if (this.notaFinal >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    
    public String getMatricula() {
        return matricula;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
}