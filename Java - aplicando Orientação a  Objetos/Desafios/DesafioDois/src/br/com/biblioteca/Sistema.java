package br.com.biblioteca;
import java.util.Scanner;

public class Sistema {

    public void ativarSistema(){
        Livro livro = new Livro(null, null);
        Scanner scanner = new Scanner(System.in); 
        while (true){
        String menu = """
                Digite uma das opcoes [1-2]
                1 - Adicionar obras ao catalogo
                2 - Sair
                """;
    
        System.out.println(menu);
        
        String opcao = scanner.nextLine();
  
            if (opcao.equals("1")){
                System.out.println("Digite as informacoes: ");
                System.out.println("Digite o titulo da obra: ");
                String titulo = scanner.nextLine();
        
                System.out.println("Digite o autor da obra: ");
                String obra = scanner.nextLine();
        
                livro.adicionarLivro(titulo, obra);
                livro.exibirDetalhes();

            } else if (opcao.equals("2")){
                break;
            }
            else {
                System.out.println("Digite uma opcao válida.");
    
            }
        }
        System.out.println("Tchau e até mais!");
        scanner.close();
    }
}
