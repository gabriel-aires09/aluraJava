package com.petshop;
/*
 * Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro animal Gato, que herdam da classe Animal. 
 * Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. 
 * Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro animal arranharMoveis() para o Gato. 
 */

public class Animal {
    private String nome;
    private int idade;
    private String corDoPelo;
    private String raca;

    

    public Animal(String nome, int idade, String corDoPelo, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.corDoPelo = corDoPelo;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void emitirSom(Animal animal){
        System.out.println("Animal " + animal.getNome() + "está emitindo som!");
    }
}
