/*
 * Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma 
 * mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
 */

import java.util.Scanner;

public class MaiorIgualDiferente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String maiorIgualDiferente = """
                Programa para saber se dois numeros são
                iguais, diferentes ou se um maior/menor que o outro!
                Digite o primeiro numero: """;
        
        System.out.println(maiorIgualDiferente);
        double numeroUm = scanner.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        double numeroDois = scanner.nextDouble();

        if (numeroUm != numeroDois){
            System.out.println("Numero " + numeroUm + " e " + numeroDois + " são diferentes");
        } else {
            System.out.println("Numeros iguais!");
        }
        
        if (numeroUm > numeroDois && numeroDois < numeroUm){
            System.out.println(numeroUm + " é maior que " + numeroDois);
        } else {
            System.out.println(numeroDois + " é maior que " + numeroUm);
        }
        scanner.close();
    }
}
