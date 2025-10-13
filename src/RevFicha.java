public class RevFicha {

    public static void main(String[] args) {
        Ficha fichaJose = new Ficha();

        fichaJose.nome = "JOSÉ DA SILVA";
        fichaJose.salario = 850.00;
        fichaJose.cpf = "531.987.001-41";
        fichaJose.idade = 32;
        fichaJose.sexo = 'M';

        System.out.println("Nome: " + fichaJose.nome);
        System.out.println("Salário: " + fichaJose.salario);
        System.out.println("CPF: " + fichaJose.cpf);
        System.out.println("Idade: " + fichaJose.idade);
        System.out.println("Sexo: " + fichaJose.sexo);
    }
}

class Ficha {
    String nome;
    double salario;
    String cpf;
    int idade;
    char sexo;
}