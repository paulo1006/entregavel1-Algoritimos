public class Pessoapriv {


    private String nome;
    private int cpf;
    private int anoNascimento;
    private float altura;

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCpf(int cpf){
        this.cpf=cpf;
    }
    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento=anoNascimento;
    }
    public void setAltura(float altura){
        this.altura=altura;
    }
    public String getNome(){
        return nome;
    }
    public int getCpf(){
        return cpf;
    }
    public int getAnoNascimento(){
        return anoNascimento;
    }
    public float getAltura(){
        return altura;
    }

    public  void mostrar(){
        System.out.println("o nome do cliente e : "+nome);
        System.out.println("o nome do cpf e : "+cpf);
        System.out.println("a altura do cliente e : "+altura);
        System.out.println("a idade do cliente  e : "+(2023-anoNascimento));
    }









}
