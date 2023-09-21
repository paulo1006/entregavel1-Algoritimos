import java.util.Scanner;
public class Primo {
   
    public static void main (String[] args){
    Scanner scan= new Scanner(System.in);
    
   System.out.println ("digite um numero");
   int numero;
   int contador=0;
   int i=2;
   
    numero=scan.nextInt();
     System.out.println ("numero escolhido foi : "+numero);
     
    while (i <=numero) {
            if (numero % i == 0){
           contador+=1;
            i++;
            
            }
     if(numero==1 || contador>0){
          System.out.println ("n primo");
          System.out.println (contador);
          break;
     }else{
          System.out.println ("primo");
          System.out.println (contador);
          break;
          
     }
    }}}