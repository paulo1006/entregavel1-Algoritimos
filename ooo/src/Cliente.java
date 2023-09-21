public class Cliente {
    private String nome;
    private int idade;
    private float renda;

    public Cliente (String nome, int idade, float renda){
         this.nome=nome;
         this.idade=idade;
         this.renda=renda;
    }

    public void setNome(String nome){
           this.nome=nome;
    }
    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public void most(){
        System.out.println(getNome());
        System.out.println(getRenda());
        System.out.println(getIdade());
    }

}
