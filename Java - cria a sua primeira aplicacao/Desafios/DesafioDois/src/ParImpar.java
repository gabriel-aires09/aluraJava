/*
 * Crie um programa que solicite ao usuário a entrada de um número inteiro. 
 * Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
 */
import java.util.Scanner;

 public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Par ou impar? Digite um numero: ");
        double numero = scanner.nextDouble();

        if (numero % 2 == 0){
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }
        scanner.close();
    }
}
