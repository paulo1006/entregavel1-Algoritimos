import java.util.Scanner;

public class ContaPrincipal {
    public static void main(String[] args) {
        Conta pessoa1=new Conta();
        pessoa1.cpf=1006;
        pessoa1.numeroConta=10061006;
        pessoa1.saldo=100;
        pessoa1.tipoCliente="s";
       // System.out.println("o saldo atua e : "+pessoa1.saldo);
        //System.out.println("A BONIFICACAO E "+pessoa1.bonificacao(100.0f));
       //// System.out.println("O SAQUE E  "+pessoa1.saque(100.0f));
       // System.out.println("O DEPOSITO FOI "+pessoa1.deposito(100.0f));
  pessoa1.mostrar();

    }
}
