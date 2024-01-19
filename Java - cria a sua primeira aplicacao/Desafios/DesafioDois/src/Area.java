/*
 * Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. 
 * Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com 
 * base na opção selecionada
 */

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcular a area. \nDigite 1 para area do quadrada e 2 para circulo [1-2]: ");
        int escolha = scanner.nextInt();
        
        switch (escolha) {
            case 1:
                System.out.println("Digite o valor do lado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = Math.pow(lado, 2);
                System.out.println("Area do quadrado = " + areaQuadrado);
                break;

            case 2:
                System.out.println("Digite o valor do raio do circulo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raio, 2);
                // String formatCirculo = String.format("%.2f", areaCirculo);
                // System.out.println("Area do circulo = " + formatCirculo);
                System.out.printf("Area do circulo = %.2f", areaCirculo);
                break;
        
            default:
                System.out.println("Digite um valor valido!");
                break;
        }
        scanner.close();
    }

}
