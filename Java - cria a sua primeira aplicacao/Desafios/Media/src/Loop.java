import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaMedia = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite a " + i + "° nota: ");
            double nota = scanner.nextDouble();
            System.out.println(i);
            notaMedia += nota;
        }   
        System.out.println("Media de nota: " + notaMedia/3);

        scanner.close();
    }
}
