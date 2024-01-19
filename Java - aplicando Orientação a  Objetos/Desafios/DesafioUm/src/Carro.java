public class Carro {
    String modelo;
    int ano;
    String cor;

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void exibirFicharTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public int calcularIdadeCarro(int ano){
        int anoAtual = 2024;
        return anoAtual - ano;
    }
}
