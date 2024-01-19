import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
       
        // Pessoa pessoa = new Pessoa();
        // pessoa.exibirOlaMundo();
        
        // System.out.println("Digite um número: ");
        // double numero = scanner.nextDouble();

        // Calculadora calculadora = new Calculadora();
        // System.out.printf("%.1f", calculadora.retornarDobro(numero));

        // Musica musicaUm = new Musica("Everbody dies", "J. Cole", 2016);
        // musicaUm.exibirFicharTecnica();

        // musicaUm.avaliarMusica(10);
        // musicaUm.avaliarMusica(7);
        // musicaUm.avaliarMusica(5);

        // System.out.println("Media de notas: " + musicaUm.calcularMedia());
        
        // Carro carro = new Carro("Pegeout 208", 0, "Azul");
        // int AnoCarro = carro.ano = 2023;
        
        // carro.exibirFicharTecnica();
        // System.out.println(carro.calcularIdadeCarro(AnoCarro) + " ano");

        System.out.println("Digite o nome do aluno: ");
        String alunoNome = scanner.nextLine();

        System.out.println("Digite a idade do aluno: ");
        Integer alunoIdade = scanner.nextInt();
        
        Aluno alunoUm = new Aluno(alunoNome, alunoIdade);

        alunoUm.exibirInformacoes();
        
        scanner.close();
    }
}
