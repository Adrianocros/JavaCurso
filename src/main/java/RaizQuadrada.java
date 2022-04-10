import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor para saver a Raiz Quadrada: ");
        double valor = scanner.nextDouble();

        double x = Math.sqrt(valor);

        System.out.println("A raiz quadara de " + valor + " é " + x);
    }
}
