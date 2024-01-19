import br.com.alura.screenmatch.calculos.Calculadora;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) throws Exception {
        Filme oldBoy = new Filme(null, 0, 0, false, 0, 0);
        Filme matrix = new Filme(null, 0, 0, false, 0, 0);
        Serie breakingBad = new Serie(null, 0, 0, false, 0, 0);
        
        oldBoy.setNome("OldBoy");
        oldBoy.setAnoDeLancamento(2003);
        oldBoy.setDuracaoEmMinutos(120);
        oldBoy.setIncluidoNoPlano(true);
        
        matrix.setNome("Matrix");
        matrix.setDuracaoEmMinutos(136);

        breakingBad.setNome("Breaking Bad");
        breakingBad.setEpisodiosPorTemporada(13);
        breakingBad.setMinutosPorEpisodio(60);
        breakingBad.setTemporadas(5);

        Calculadora calculadora = new Calculadora();
        calculadora.inclui(breakingBad);
        calculadora.inclui(matrix);
        calculadora.inclui(oldBoy);

        System.out.println(calculadora.getTempoTotal());
        
        // // Metodos
        // oldBoy.exibeFichaTecnica();
        // oldBoy.avalia(8);
        // oldBoy.avalia(9);
        // oldBoy.avalia(10);
        // oldBoy.avalia(7);

        // System.out.println("Media de avaliações: " + oldBoy.pegaMedia());
        

    }
}
