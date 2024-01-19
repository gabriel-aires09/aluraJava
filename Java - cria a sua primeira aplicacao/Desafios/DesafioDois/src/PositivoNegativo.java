/*
 * Crie um programa que solicite ao usuário digitar um número. 
 * Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
 */

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String positivoNegativo = """
                Positivo ou Negativo?
                Digite um numero: """;
        
        System.out.println(positivoNegativo);
        double numero = scanner.nextDouble();

        if (numero < 0 ){
            System.out.println("O numero " + numero + " é negativo!");
        } else {
            System.out.println("O numero " + numero + " é positivo!");
        }
        scanner.close();
    }
}
