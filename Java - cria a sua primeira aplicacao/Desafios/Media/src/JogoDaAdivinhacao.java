/* Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 
 * e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. 
 * A cada tentativa, o programa deve informar  se o número digitado pelo usuário é maior ou menor 
 * do que o número gerado.
 * 
 */
import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroRandom = new Random().nextInt(100);
        
        String tigrinho = """
                JOGO DA ADIVINHAÇÃO: A LENDA DO TIGRINHO
                Você só tem cinco tentativas para ganhar!
                """;
        System.out.println(tigrinho);

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "° Tentativa. Digite um numero: ");
            int numero = scanner.nextInt();

            if (numero == numeroRandom){
                System.out.println("Acerto miseravi. Voce ganhou no Tiger Fortune!");
                break;
            } else {
                System.out.println("Tente novamente!");
            }
            
            if (i == 5){
                System.out.println("Tigrinho caloteiro! Você perdeu tudo!");
            }     
        }
        scanner.close();
    }
}
