import java.util.Scanner;

public class AumentoSalario2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o salário atual do funcionario: ");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Qual o percentual de aumento (%): ");
        double percentualAumento = scanner.nextDouble();

        double novoSalario = salarioAtual * (1 + (percentualAumento / 100));
        System.out.println("O novo salário do funcionario será: " + novoSalario);

        scanner.close();
    }
}
