public class Alunoteste {
    public static void main(String[] args) {
        Aluno aluno1 =new Aluno();
        aluno1.matricula=123456;
        aluno1.cpf= 1320012 ;
        aluno1.curso="ANALISE E DENSEVOLVIMENTO DE SOFTWARE";
        aluno1.nome="PAULO MATHEUS DE SOUSA SILVEIRA";
        aluno1.notaMedia= 7.0F;

        aluno1.estudar(5);
        aluno1.cadastro(1006);


    }
}
