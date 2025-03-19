
import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        int idadeAnos = anoAtual - anoNascimento;

        int idadeMeses = idadeAnos * 12;
        int idadeDias = idadeAnos * 365;
        int idadeSemanas = idadeAnos * 52;

        System.out.println("Sua idade em anos: " + idadeAnos);
        System.out.println("Sua idade em meses: " + idadeMeses);
        System.out.println("Sua idade em dias: " + idadeDias);
        System.out.println("Sua idade me semanas: " + idadeSemanas);

        scanner.close();
    }
}
