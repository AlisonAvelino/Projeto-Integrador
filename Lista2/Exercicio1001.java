import java.util.Scanner;

public class Exercicio1001 {
    public static void main(String[] args) { 
        
        Scanner leitor = new Scanner(System.in);
        int A, B, X;

        A = leitor.nextInt();
        B = leitor.nextInt();

        X = A + B;
        
        System.out.println("X = " + X);
    }
}
