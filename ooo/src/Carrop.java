import java.sql.SQLOutput;
import java.util.Scanner;

public class Carrop {
    public static void main(String[] args) {

        float p;
        Scanner scan = new Scanner(System.in);
        Carro carro1 = new Carro("ferrari","sedan","preta",100f);
        System.out.println("didgite um valor para o carro");
        carro1.setPreco(p =scan.nextFloat());

     ////   System.out.println(carro1.getMarca());
     ////   System.out.println(carro1.getModelo());
     ////   System.out11rintln(carro1.getCor());

        carro1.getMostrar();System.out.println(carro1.getMostrar());
   }
}
