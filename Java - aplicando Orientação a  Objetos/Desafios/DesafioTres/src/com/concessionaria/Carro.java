package com.concessionaria;
/*
 * Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, 
 * os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, 
 * utilizando-a na classe principal para definir preços e mostrar informações. 
 */

import java.util.ArrayList;
import java.util.List;

public class Carro {
    private int identificaCarro;
    private String marca;
    private int ano;
    private String cor;
    private double preco;
    private List<ModeloCarro> carros = new ArrayList<>();
    private double somaPreco = 0.0;
    private Double menorValor = 0.0;
    private Double maiorValor = 0.0;

    public Carro(String marca, int ano, String cor, double preco){
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public List<ModeloCarro> getCarros(){
        return carros;
    }

    public void adicionarCarros(ModeloCarro modelo){
        this.getCarros().add(modelo);
    }

    public void exibirInformacoes(){
        for (ModeloCarro carro : carros) {
            identificaCarro++;
            System.out.println("Carro " + identificaCarro);
            System.out.println(carro.getMarca());
            System.out.println(carro.getCor());
            System.out.println(carro.getAno());
            System.out.printf("%.3f\n", carro.getPreco());
            System.out.println(carro.getModelo());
            System.out.println(carro.getPortas());
        }
    }

    public void calcularPrecoMedio(){
        // foreach para somar os preços dos modelos
        for (ModeloCarro modelo : carros) {
            somaPreco += modelo.getPreco();
        }

        int quantidadeModelo = carros.size();

        double media = somaPreco / quantidadeModelo;
        System.out.printf("Media dos preços: R$%.3f\n", media);
    }

    public void encontrarMenorValor(){
        menorValor = carros.get(0).getPreco();

        for (ModeloCarro carro : carros){
            if (carro.getPreco() < menorValor){
                menorValor = carro.getPreco();
            }
        }
        System.out.printf("Menor valor: R$%.3f\n", menorValor);

    }

    public void encontrarMaiorValor(){
        maiorValor = carros.get(0).getPreco();

        for (ModeloCarro modeloCarro : carros) {
            if (maiorValor < modeloCarro.getPreco()){
                maiorValor = modeloCarro.getPreco();
            }   
        }
        System.out.printf("Maior valor: R$%.3f\n", maiorValor);

    }
}
    
