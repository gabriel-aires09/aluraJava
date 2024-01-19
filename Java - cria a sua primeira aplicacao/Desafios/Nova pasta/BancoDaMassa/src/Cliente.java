import java.util.Scanner;

public class Cliente {
    Scanner scanner = new Scanner(System.in);
    String nome;
    String tipoConta;
    double saldo;

    public Cliente(String nome, String tipoConta, double saldo) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public double receberValor(double valor){
        return saldo = saldo + valor;
    }

    public void consultarSaldo(){
        System.out.println("Saldo disponivel R$: " + saldo);
    }

    public double transferirValor(double valor){
        return saldo = saldo - valor;
    }
    
}
