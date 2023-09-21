public class ProdutoPrincipal {
    public static void main(String[] args) {
        int n=5;
        int pesogeral = 0;
        float pesomedia=0;
        float leve=0;
        Produto[] produtos =new Produto[n];
        produtos[0]=new Produto("10101",20,300);
        produtos[1]=new Produto("10101",230,11100);
        produtos[2]=new Produto("10101",50,4);
        produtos[3]=new Produto("10101",1,10);
        produtos[4]=new Produto("10101",9,1020);

        for(int i=0;i<n;i++){
            System.out.println("produto: "+produtos[i]);
                if(produtos[i].peso>10 && produtos[i].valor>50.0){
                    pesogeral+=1;
                }
                if(produtos[i].peso<produtos[4-i].peso){

                    leve=produtos[i].peso;
                }
            pesomedia=produtos[i].peso+pesomedia;
        }
        System.out.println("o numeros de peso maior que 10 kg : "+pesogeral);
        System.out.println("peso media : "+pesomedia/5);
        System.out.println("mais leve e "+leve);

    }
}
