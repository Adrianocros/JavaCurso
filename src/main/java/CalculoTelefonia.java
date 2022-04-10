import java.util.Locale;
import java.util.Scanner;

//      Uma operadora de telefonia cobra R$ 50.00 por um plano basico que da direito a 100 minutos.
//      Cada minuto exedido a franquia custo R$2.00
//      Fazer um programa para ler a quantidade de minutos que a pessoa consumiu e mostrar o valor pago



public class CalculoTelefonia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os minutos consumidos: ");

        int minutos = scanner.nextInt();
        double franquia = 50;


        if (minutos > 100) {
            franquia += (minutos - 100) * 2;
        }
        System.out.printf("Voce ira pagar R$ %.2f%n ", franquia);
    }
}



