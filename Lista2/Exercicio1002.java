import java.util.Scanner;

public class Exercicio1002 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double area, raio;
        double n = 3.14159;

        raio = leitor.nextDouble();

        area = n * (raio*raio);
        
        System.out.println("A=" +  String.format("%.4f", area));
    }
}
