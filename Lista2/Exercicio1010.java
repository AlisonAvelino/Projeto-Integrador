import java.util.Scanner;

public class Exercicio1010 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int code1, code2, numero1, numero2;
        double valor1, valor2, total;

        code1 = leitor.nextInt();
        numero1 = leitor.nextInt();
        valor1 = leitor.nextDouble();

        code2 = leitor.nextInt();
        numero2 = leitor.nextInt();
        valor2 = leitor.nextDouble();

        total = (numero1*valor1)+(numero2*valor2);
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));
    
    }
}
