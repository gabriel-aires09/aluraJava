package com.concessionaria;

public class ModeloCarro extends Carro {
    private String modelo;
    private int portas;
    
    public ModeloCarro(String marca, int ano, String cor, double preco, String modelo, int portas) {
        super(marca, ano, cor, preco);
        this.modelo = modelo;
        this.portas = portas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

}
