import java.util.Scanner;
public class Somador {
   
    public static void main (String[] args){
    Scanner scan= new Scanner(System.in);
    
   System.out.println ("digite um numero");
   int numero;
   int i=1;
   int soma=0;
   numero=scan.nextInt();
    System.out.println ("O numero escolhido foi : "+numero);
    while(i<=numero){
        soma+=i;
        i++;
    }
   System.out.println ("a soma total e "+soma);
  
     
 }
}