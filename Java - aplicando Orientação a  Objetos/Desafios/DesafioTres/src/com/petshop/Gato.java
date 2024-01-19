package com.petshop;
public class Gato extends Animal{

    private boolean arranha;

    public Gato(String nome, int idade, String corDoPelo, String raca, boolean arranha) {
        super(nome, idade, corDoPelo, raca);
        this.arranha = arranha;
    }

    @Override
    public void emitirSom(Animal animal){
        System.out.println("O " + animal.getNome() + " mia!");
    }

    public void arranharMoveis(Gato gato){
        if (arranha == true){
            System.out.println("O " + gato.getNome() + " arranha os moveis!");

        } else {
            System.out.println("Gato educado não arranha móvel de arrombado");
        }
    }

}
