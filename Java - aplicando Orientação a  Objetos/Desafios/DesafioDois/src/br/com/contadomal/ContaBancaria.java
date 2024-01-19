package br.com.contadomal;
public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public ContaBancaria(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void setNumeroConta (int numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setTitular (String titular){
        this.titular = titular;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void exibirInformacoes(){
        System.out.println("Titular: " + getTitular());
        System.out.println("Conta corrente: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
    }

    public void sacarValor(double valor){
        if (valor < 0){
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
            System.out.println("Saldo atual: R$" + getSaldo());
        }
    }

    public void depositarValor(double valor){
        saldo += valor;
        System.out.println("Saldo atual: R$ " + getSaldo());
    }
}
