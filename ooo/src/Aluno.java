public class Aluno {
    String nome;
    int matricula;
    int cpf;
    String curso;

    float notaMedia;


    void estudar(float qtdnotas){
        notaMedia=notaMedia*qtdnotas;
        System.out.println("aprovado com "+notaMedia);
    }
    void cadastro(int id){
        System.out.println("a indentificação do aluno "+nome+" do curso de "+curso+" é : "+cpf+" - "+matricula+"-"+id+" ");
    }


}
