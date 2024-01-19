public class Aluno {
    String nome;
    Integer idade;

    public Aluno(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInformacoes(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade: " + idade);
    }
}
