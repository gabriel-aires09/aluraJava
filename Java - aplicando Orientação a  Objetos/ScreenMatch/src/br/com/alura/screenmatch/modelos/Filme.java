package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo{
    private String diretor;

    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, boolean incluidoNoPlano,
            int somaDasAvaliacoes, int totalDeAvaliacoes) {
        super(nome, anoDeLancamento, duracaoEmMinutos, incluidoNoPlano, somaDasAvaliacoes, totalDeAvaliacoes);
    }

    public String getDirector(){
        return this.diretor;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    
}
