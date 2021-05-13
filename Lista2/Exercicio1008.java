import java.util.Scanner;

public class Exercicio1008 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero, horas;
        double valor, salario;

        numero = leitor.nextInt();
        horas = leitor.nextInt();
        valor = leitor.nextDouble();

        salario = horas*valor;

        System.out.println("NUMBER = " + numero);
        System.out.println("SALARY = U$ " + String.format("%.2f", salario));
    

    }
}
