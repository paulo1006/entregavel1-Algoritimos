public class vetor {

    public static void main(String[] args) {
        int[] vet={12,2111,33,102,2};
            int aux=0;
        for (int i=0;i<vet.length;i++){
            for (int j=0;j<vet.length;j++){
                if(vet[i]<vet[j]){
                    aux=vet[i];
                    vet[i]=vet[j];
                    vet[j]=aux;
                }



            }
        }
        for(int k=0; k<vet.length; k++){
            System.out.println(vet[k]+"  ");

        }

    }

}
