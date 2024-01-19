package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private int somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    
    public void setNome (String nome){
        this.nome = nome;
    }

    public void setAnoDeLancamento (int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano (boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos (int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome(){
        return nome;
    }

    public int getAnodeLancamento(){
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos (){
        return duracaoEmMinutos;
    }

    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    public Titulo(String nome, int anoDeLancamento, int duracaoEmMinutos, boolean incluidoNoPlano,
            int somaDasAvaliacoes, int totalDeAvaliacoes) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.incluidoNoPlano = incluidoNoPlano;
        this.somaDasAvaliacoes = somaDasAvaliacoes;
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }
    
    public void avalia(double avaliacao){
        somaDasAvaliacoes += avaliacao;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
