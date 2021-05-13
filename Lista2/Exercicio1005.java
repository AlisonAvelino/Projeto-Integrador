import java.util.Scanner;

public class Exercicio1005 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A, B, MEDIA;

        A = leitor.nextDouble();
        B = leitor.nextDouble();

        MEDIA = ((3.5*A) + (7.5*B))/11;

        System.out.println("MEDIA = " + String.format("%.5f", MEDIA));

    }
}
