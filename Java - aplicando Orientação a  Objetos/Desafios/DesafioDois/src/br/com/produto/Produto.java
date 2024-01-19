package br.com.produto;
/*
 * Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e 
 * modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
 */

public class Produto {
    private String nome;
    private double preco;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public void aplicarDesconto (double valor){

        if (valor > 0.10 && valor <= 0.90){
            double desconto = preco * valor;
            preco -= desconto;

            System.out.println("Desconto: R$" + desconto);
            System.out.println("Desconto aplicado: R$" + preco);
        } else {
            System.out.println("Digite um valor  entre 10% a 90% de desconto");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Nome do produto: " + getNome());
        System.out.println("Valor do produto: R$" + getPreco());
    }

}
