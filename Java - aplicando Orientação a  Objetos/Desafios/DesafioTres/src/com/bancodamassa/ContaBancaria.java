package com.bancodamassa;
public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Operação depositar
    public void depositarSaldo(double valor){
        if (valor > 0){
            saldo += valor;
        } else {
            System.out.println("Valor invalido");
        }
    }
    
    // Operação sacar
    public void sacarValor(double valor){
        if (valor > saldo) {
            System.out.println("Saldo indisponivel para deposito");
        } else {
            saldo -= valor;
            System.out.println("Saldo atual " + getSaldo());
        }
    }

    // Operação consultar saldo
    public void consultarSaldo(){
        System.out.println("Saldo atual: R$" + getSaldo());
    }

}
