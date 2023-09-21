import java.util.Scanner;
public class Cont {
    public static void main(String[] args) {
        int contagem=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o numero 1");
        int n1 = scan.nextInt();
        System.out.println("digite o numero 2");
        int n2 = scan.nextInt();

        for(int i=n1;i<=n2;i++){
            int cont=0;
            cont++;
             contagem+=cont;

        }
        System.out.println(contagem);
    }
}
