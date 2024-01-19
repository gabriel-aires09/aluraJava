package br.com.media;
import java.util.ArrayList;
/* 
 * Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e 
 * modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno. 
 */
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Aluno {
    private String nome;
    private Double nota;
    private List<Double> notas = new ArrayList<>(); 

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNotas(Double nota){
        this.nota = nota;
    }

    public double getNota(){
        return nota;
    }

    public List<Double> getNotas(){
        return notas;
    }

    public void adicionarNotas(Double nota){
        this.getNotas().add(nota);
    }

    public void calcularNotas(){
        if (notas != null && !notas.isEmpty()){
            DoubleSummaryStatistics stats = getNotas().stream().mapToDouble(Double::doubleValue).summaryStatistics();
            double media = stats.getAverage();
            System.out.println("Media: " + media);
        } else {
            System.out.println("Digite um valor valido");
        }
    }
}
