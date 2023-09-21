import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int anoNascimento;
    private float peso;
    private float altura;


    public void atributos(String nome, int anoNascimento, float peso, float altura){
        this.nome=nome;
        this.anoNascimento=anoNascimento;
        this.peso=peso;
        this.altura=altura;

    }


    // Método para calcular a idade da pessoa
        public int calcIdade(){

        return 2023-anoNascimento;
    }

    // Método para calcular o Índice de Massa Corporal (IMC)
    public float calcIMC() {
        return peso / (altura * altura);
    }

    // Método para calcular a quantidade de água que a pessoa deve beber por dia (em ml)
    public float calcAgua() {
        return 35*peso;
    }

    // Método para mostrar informações da pessoa
    public void mostrar() {
        int idade = calcIdade();
        double imc = calcIMC();
        double quantidadeAgua = calcAgua();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("IMC: " + imc);
        System.out.println("Quantidade de água recomendada por dia: " + quantidadeAgua + " ml");
    }

}