// import java.util.Scanner;

// import java.util.InputMismatchException;
// import br.com.contadomal.ContaBancaria;
// import br.com.idades.IdadePessoa;
// import br.com.produto.Produto;
// import br.com.media.Aluno;
import br.com.biblioteca.Sistema;

public class Main {
    public static void main(String[] args) throws Exception {
        // Scanner scanner = new Scanner(System.in);
        
        // Atividade 1
        // ContaBancaria conta = new ContaBancaria(66666, 1000, "Aleksdramus");
        // System.out.println("Digite uma das opções: ");
        // String opcoes = """
        //         1 - Exibir informações da conta
        //         2 - Depositar valor
        //         3 - Sacar valor
        //         """;

        // System.out.println(opcoes);        
        // String opcao = scanner.nextLine();

        // switch (opcao) {
        //     case "1":
        //         conta.exibirInformacoes();
        //         break;
        //     case "2":
        //         System.out.println("Digite um valor: ");
        //         double valor = scanner.nextDouble();
        //         conta.depositarValor(valor);
        //         break;
        //     case "3":
        //         System.out.println("Digite um valor: ");
        //         valor = scanner.nextDouble();
        //         conta.sacarValor(valor);
        //         break;
        //     default:
        //         System.out.println("Digite uma opção válida!");
        //         break;
        // }
        
        // Atividade 2
        // IdadePessoa idade = new IdadePessoa();
        // try {
        //     System.out.println("Digite a sua idade: ");
        //     int idadePessoa = scanner.nextInt();
        //     idade.verificarIdade(idadePessoa);  
        // } catch (InputMismatchException e) {
        //     System.out.println("Digite um valor válido!");
        //     scanner.next();
        // } finally{
        //     scanner.close();
        // }

        // Atividade 3
        // Produto produto = new Produto();
        // System.out.println("Digite o nome do produto: ");
        // String nomeProduto = scanner.nextLine();
        // produto.setNome(nomeProduto);
     
        // System.out.println("Digite um valor para o produto: R$");
        // double precoProduto = scanner.nextDouble();
        // produto.setPreco(precoProduto);

        // System.out.println("Digite o valor do desconto [10% a 90%]: ");
        // double desconto = scanner.nextDouble();
        // produto.aplicarDesconto(desconto);
        
        // produto.exibirInformacoes();
        // scanner.close();
        
        // Atividade 4
        // Aluno aluno = new Aluno();
        
        // System.out.println("Sistema para calcular media das notas dos alunos: ");

        // for (int i = 1; i <= 3; i++) {
        //     System.out.println("Digite a " + i +"° nota: ");
        //     Double nota = scanner.nextDouble();
        //     aluno.adicionarNotas(nota);
        // }
        // aluno.calcularNotas();
        // scanner.close();

        // Atividade 5
        Sistema sistema = new Sistema();
        sistema.ativarSistema();

    }
}
