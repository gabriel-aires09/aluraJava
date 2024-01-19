import java.util.Scanner;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class App {
    /* Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. 
     * Utilize variáveis para representar os valores das temperaturas e imprima no console o valor
     * convertido de Celsius para Fahrenheit.
     * 
     * Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: 
     * (temperatura * 1.8) + 32.
     */
    public static void main(String[] args) throws Exception {
        // Scanner teclado = new Scanner(System.in);
        // String inicio = """
        //         Converta celsius para Fahrenheit
        //         Digite um valor da temperatura em celsius: """;
        
        // System.out.println(inicio);
        // Integer celsius = teclado.nextInt();

        // double temperatura = (celsius * 1.8) + 32;

        // System.out.println("Celsius para Fahrenheit: "+ temperatura + "F");

        // teclado.close();


        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        new GraphicalUser().setVisible(true);;
    }
}
