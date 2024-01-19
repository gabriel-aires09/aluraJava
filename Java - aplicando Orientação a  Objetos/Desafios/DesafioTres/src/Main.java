// import com.concessionaria.ModeloCarro;
// import com.petshop.*;
// import com.bancodamassa.*;
import com.numeroprimo.*;

public class Main {
    public static void main(String[] args) throws Exception {
    // Atividade I
    //     ModeloCarro sistema = new ModeloCarro(null, 0, null, 0, null, 0);
    //     ModeloCarro carro1 = new ModeloCarro("Toyota", 2023, "Vermelho", 80.000, "Ethios", 4);
    //     ModeloCarro carro2 = new ModeloCarro("Honda", 2022, "Azul", 75.000, "Civic", 4);
    //     ModeloCarro carro3 = new ModeloCarro("Chevrolet", 2021, "Preto", 70.000, "Onix", 4);
        
    //     sistema.adicionarCarros(carro1);
    //     sistema.adicionarCarros(carro2);
    //     sistema.adicionarCarros(carro3);
        
    //     // sistema.exibirInformacoes();
    //     sistema.calcularPrecoMedio();
    //     sistema.encontrarMenorValor();
    //     sistema.encontrarMaiorValor();
    // 

    // Atividade II
        // Cachorro fera = new Cachorro("Fera", 4, "preto", "Vira-lata", false);
        // fera.emitirSom(fera);
        // fera.abanarRabo(true,fera);

        // Gato lua = new Gato("Lua", 2, "Preto e branco", "Siamês", true);
        // lua.emitirSom(lua);
        // lua.arranharMoveis(lua);

    // Atividade III
        // ContaCorrente conta = new ContaCorrente("Gabriel Aires", 6667, 200);
        // conta.consultarSaldo();
        // conta.depositarSaldo(100);
        // conta.consultarSaldo();
        // conta.sacarValor(100);
        // conta.cobrarTarifaMensal(25);

    // Atividade IV
        NumerosPrimos numerosPrimos = new NumerosPrimos();
        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
        GeradorPrimo geradorPrimo = new GeradorPrimo();

        // Testando métodos da classe base
        System.out.println("Listar primos até 20: " + numerosPrimos.listarPrimos(20));

        // Testando método da subclasse VerificadorPrimo
        System.out.println("Verificar se é primo: " + verificadorPrimo.verificarSeEhPrimo(19));

        // Testando método da subclasse GeradorPrimo
        System.out.println("Gerar próximo primo após 20: " + geradorPrimo.gerarProximoPrimo(20));
    }
}
