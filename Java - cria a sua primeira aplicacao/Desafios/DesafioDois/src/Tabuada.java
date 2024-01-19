// Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("A tabuada do MAL! AHUHAUHAUHAU");
        System.out.println("Digite um numero: ");
        Integer numero = scanner.nextInt();

        List<Integer> listaNumero = new ArrayList<>();

        // Resolução Um
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(numero + " * " + i + " = " + numero * i);
        // }

        // Resolução Dois
        for (int i = 1; i <= 10; i++) {
            listaNumero.add(i);
        }

        for (Integer numeros : listaNumero) {
            System.out.println(numero + " * " + numeros + " = " + numero * numeros);  
        }
        scanner.close();
    }
}
