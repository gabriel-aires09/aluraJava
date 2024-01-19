package com.bancodamassa;
public class ContaCorrente extends ContaBancaria {
    
    public ContaCorrente(String titular, int numeroConta, double saldo) {
        super(titular, numeroConta, saldo);
    }
    
    public void cobrarTarifaMensal(double tarifa){
        System.out.println(tarifa);
        sacarValor(tarifa);
    }

}
