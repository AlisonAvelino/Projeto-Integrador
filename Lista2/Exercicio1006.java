import java.util.Scanner;

public class Exercicio1006 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A, B, C, MEDIA;

        A = leitor.nextDouble();
        B = leitor.nextDouble();
        C = leitor.nextDouble();

        MEDIA = ((2*A) + (3*B)+(5*C))/10;

        System.out.println("MEDIA = " + String.format("%.1f", MEDIA));

    }
}
