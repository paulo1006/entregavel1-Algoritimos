import java.util.Scanner;
public class Conta {

        int cpf;
        int numeroConta;
        float saldo;
        float valor;
        String tipoCliente;

    public float bonificacao(float saldo) {
        float bonific;
        if(tipoCliente.equals("sim")){

            System.out.println("cliente espcial");}
        else {
            System.out.println("n cliente espcial");
        }

        return bonific=saldo + (100f / 10f);
    }
        public float saque(float saldo){
            System.out.println("digite um valor");
            Scanner scan=new Scanner(System.in);
            valor= scan.nextInt();
                return saldo-valor;
        }
        public float deposito(float saldo){
                return saldo+valor;
        }

        public void mostrar(){
            System.out.println("o saldo atua e : "+saldo);
            System.out.println("A BONIFICACAO E "+bonificacao(100.0f));
            System.out.println("O SAQUE E  "+saque(100.0f));
            System.out.println("O DEPOSITO FOI "+deposito(100.0F));
        }


}
