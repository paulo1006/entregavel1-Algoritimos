public class Produto {

    String codigo;
    float peso, valor;

    public void mostrar(){
        System.out.println(this);
        //System.out.println("Produto: " + "codigo='" + codigo + '\'' + ", peso=" + peso + ", valor=" + valor);

    }
    public int contarProdutos(Produto produtos[]){
        int cont = 0;
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].peso > 10 && produtos[i].valor < 50){
                cont++;
            }
        }
        return cont;
    }
    public float mediaPesos(Produto produtos[]){
        float media = 0;
        for (int i = 0; i < produtos.length; i++) {
            media = media + peso;
            //media += peso;
        }
        return media/produtos.length;
    }

    public float mediaValores(Produto produtos[]){
        float media = 0;
        int cont = 0;
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].peso > 10) {
                media = media + produtos[i].valor;
                cont++;
                //media += peso;
            }
        }
        return media/cont;
    }

    public void menorPeso(Produto produtos[]){
        float peso = 99999999;
        Produto menor = new Produto();
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].peso < peso){
                peso = produtos[i].peso;
                menor = produtos[i];
            }
        }
        menor.mostrar();
    }

    public void maiorValor(Produto produtos[]){
        float valor = -1;
        Produto maior = new Produto();
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].valor > valor){
                valor = produtos[i].valor;
                maior = produtos[i];
            }
        }
        maior.mostrar();
    }
    @Override
    public String toString() {
        return "Produto: " +
                "codigo='" + codigo + '\'' +
                ", peso=" + peso +
                ", valor=" + valor;
    }
}
