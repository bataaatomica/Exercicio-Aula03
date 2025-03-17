import java.util.Scanner;

public class Consumoderacao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o peso do saco de ração em (kg)? ");
        double pesokg = scanner.nextDouble();

        System.out.println("Digite a quantidade de ração fornecida por dia em (gramas)? ");
        double pesoPorGatos = scanner.nextDouble();

        double pesoSacoGramas = pesokg * 1000;
        double consumoTotal = 2 * pesoPorGatos * 5;
        double racaoRestante = pesoSacoGramas - consumoTotal;

        System.out.println("Após 5 dias irá restar " + racaoRestante + " gramas de ração.");

        scanner.close();
    }

}
