import java.util.Scanner;

public class Exercicio1009 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        double salarioFixo, vendas, comissao, salarioBruto;

        nome = leitor.next();
        salarioFixo = leitor.nextInt();
        vendas = leitor.nextDouble();

        comissao = (vendas/100) * 15;
        salarioBruto = salarioFixo + comissao;

        System.out.println("TOTAL = R$ " + String.format("%.2f", salarioBruto));
    }
}
