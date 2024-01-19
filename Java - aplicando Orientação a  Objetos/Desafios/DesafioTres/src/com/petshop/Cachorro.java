package com.petshop;
public class Cachorro extends Animal{

    private boolean abanaRabo;

    public Cachorro(String nome, int idade, String corDoPelo, String raca, boolean abanaRabo) {
        super(nome, idade, corDoPelo, raca);
        this.abanaRabo = abanaRabo;
    }

    @Override
    public void emitirSom(Animal animal){
        System.out.println("O " + animal.getNome() + " late!");
    }

    // criei o argumento true para testar o método
    public void abanarRabo(boolean abana, Cachorro cachorro){
        this.abanaRabo = abana;
        
        if (abanaRabo == true){
            System.out.println("O " + cachorro.getNome() + " esta abanhando o rabo!");
        } else{
            System.out.println("Sem abanar rabo");
        }
    }
}
