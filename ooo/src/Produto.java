public class Produto {

    String codigo;
    float peso;
    float valor;
    public Produto(String codigo,float peso,float valor){
            this.codigo=codigo;
            this.peso=peso;
            this.valor=valor;
    }
    public void mostrar (String codigo,float peso,float valor){
        System.out.println("codigo : "+codigo);
        System.out.println("peso : "+peso);
        System.out.println("valor : "+valor);
    }


}
