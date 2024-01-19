/*
 * Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e 
 * modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.
 * 
 */

package br.com.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private List<Livro> livros = new ArrayList<>();
    
    
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public List<Livro> getLivros() {
        return livros;
    }
    
    public Livro adicionarLivro(String titulo, String autor){
        Livro livro = new Livro(titulo, autor);
        this.getLivros().add(livro);
        return livro;
    }

    public void exibirDetalhes(){
        // Implementação usando incrementação
        // int numeroObra = 1;
        
        for (Livro livro : livros) {
            int numeroLivro = livros.indexOf(livro) + 1;
            System.out.println("Obra " + numeroLivro);
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("-----------------------------");
            // numeroObra++;
        }
    }
}
