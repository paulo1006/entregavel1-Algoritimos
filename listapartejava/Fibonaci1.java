import java.util.Scanner;

public class Fibonaci1 {

    public int fiboCalc(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {

            int[] fibo= new int[n + 1];
            fibo[0] = 0;
            fibo[1] = 1;
            for (int i = 2; i <= n; i++) {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
            return fibo[n];
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("digite");
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            Fibonaci1 teste = new Fibonaci1();
            System.out.print(teste.fiboCalc(i)+"\n");
        }

    }



}