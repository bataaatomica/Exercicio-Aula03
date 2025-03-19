import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salário atual: ");
        double salarioAtual = scanner.nextDouble();
        double novoSalario = salarioAtual * 1.25;

        System.out.println("O seu novo salário é: " + novoSalario);

        scanner.close();
    }

}
