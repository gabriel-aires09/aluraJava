import java.util.InputMismatchException;
import java.util.Scanner;

public class Banco {
    public static void main(String...args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        Cliente cliente = new Cliente("Gabriel Oliveira Aires", "Corrente", 2500);
        System.out.println(cliente);
        System.out.println("********************************");
        System.out.println("Dados iniciais do cliente: \nNome: " + cliente.nome + "\nTipo Conta: " + cliente.tipoConta + "\nSaldo inicial: R$ " + cliente.saldo);
        System.out.println("********************************\n");
        
        while(true){
            String operation = """
                    Operações
                    1 - Consultar saldos
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair\n""";
            System.out.println(operation);
            
            try {
                int escolha = scanner.nextInt();
                
                if (escolha == 1){
                    cliente.consultarSaldo();
                    System.out.println("\n");
                } else if (escolha == 2){
                    System.out.println("\n");
                    System.out.println("Digite um valor R$: ");
                    double valor = scanner.nextDouble();
                    cliente.receberValor(valor);
                    System.out.println("\nSaldo atualizado R$: " + cliente.saldo + "\n");
                } else if (escolha == 3){
                    System.out.println("\nDigite um valor R$: ");
                    double valorDois = scanner.nextDouble();
                    if (valorDois > cliente.saldo){
                        System.out.println("Não há saldo suficiente para transferência");
                    } else {
                        cliente.transferirValor(valorDois);
                        System.out.println("\nSaldo atualizado R$: " + cliente.saldo + "\n");
                    }
                } else if (escolha == 4) {
                    System.out.println("\nObrigado por usar nossos serviços e até a próxima\n");
                    break;
                } else {
                    System.out.println("Digite um numero valido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, escolha uma opção valida!");
                scanner.next();
            } finally {
                scanner.close();
            }
        }
    }
}
