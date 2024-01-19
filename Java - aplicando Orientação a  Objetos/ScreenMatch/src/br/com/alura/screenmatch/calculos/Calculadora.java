package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titulo;

public class Calculadora {
    private int tempoTotal;

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal(){
        return tempoTotal;
    }
}
