import  java.util.Scanner;
public class maxdiv {

    int n1,n2;
    int aux;
    public  int maxDivisor(int n1,int n2){

        while(n2!=0){
            aux=n2;
            n2=n1%n2;
            n1=aux;
        }
        return n1;
    }

    public static void main(String[] args) {
        int n1,n2;
        Scanner scan = new Scanner(System.in);
        System.out.println("digite n1");
        n1= scan.nextInt();
        System.out.println("digite n1");
        n2= scan.nextInt();

        maxdiv teste = new maxdiv();

        System.out.println(teste.maxDivisor(n1,n2));

    }
}
