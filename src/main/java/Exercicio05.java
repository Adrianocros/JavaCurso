import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
//        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
//        O código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o codigo da primeira peça: ");
        int peca1 = scanner.nextInt();

        System.out.print("Digite a quantidade de peças: ");
        int quantpecaUm = scanner.nextInt();

        System.out.print("Digite o valor da peça R$ ");
        double valorUm = scanner.nextDouble();

        System.out.println("################################");

        System.out.print("Digite o codigo da segunda peça: ");
        int peca2 = scanner.nextInt();

        System.out.print("Digite a quantidade de peças: ");
        int quantpecaDois = scanner.nextInt();

        System.out.print("Digite o valor da peça R$ ");
        double valorDois = scanner.nextDouble();

        double totalAPagar = quantpecaUm * valorUm + quantpecaDois * valorDois;

        System.out.printf("Total a pagar R$ %.2f%n", totalAPagar);
    }
}
