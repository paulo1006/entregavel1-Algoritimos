import java.util.Scanner;
public class Conta {

    String cpf;
    int banco;
    float saldo;
    float valor;
    float boni;
    public Conta(String cpf, int banco, float saldo, float valor) {
        this.cpf = cpf;
        this.banco = banco;
        this.saldo = saldo;
        this.valor = valor;
    }



    public void bonificacao(){
         boni=saldo*((float) 10 /100);
        System.out.println("A BONIFICAÇÃO E : "+boni);
        System.out.println("salario + bonificacao E : "+(boni+saldo));
    }
    public void saque(){
        System.out.println("O SALDO POS SAQUE : "+(saldo-valor));
    }
    public void deposito(){
        float dep;
        dep=saldo+valor;
        System.out.println("O SALDO POS DEPOSITO : "+(dep));
    }

   public void mostrar(){
    System.out.println("A BONIFICAÇÃO E : "+saldo*((float) 10 /100));
         System.out.println("salario + bonificacao E : "+(boni+saldo));
         System.out.println("O SALDO POS SAQUE : "+(saldo-valor));
         System.out.println("O SALDO POS DEPOSITO : "+(saldo+valor));

    }


}
