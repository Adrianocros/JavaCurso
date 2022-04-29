package Interface.MetodosPadrao.Application;

import Interface.MetodosPadrao.Services.ServicoAmericanoDeJuros;
import Interface.MetodosPadrao.Services.ServicoBrasileiroDeJuros;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor: ");
        double montante = scanner.nextDouble();
        System.out.print("Meses: ");
        int meses = scanner.nextInt();

        ServicoBrasileiroDeJuros br = new ServicoBrasileiroDeJuros(2.0);
        double pagamentoBR = br.pagamento(montante, meses);

        ServicoAmericanoDeJuros usa = new ServicoAmericanoDeJuros(1.0);
        double pagamentoUSA = usa.pagamento(montante, meses);

        System.out.println("### Juros Brasileiro ####");
        System.out.println("Pagamento apos " + meses + " meses");
        System.out.println(String.format("%.2f", pagamentoBR));

        System.out.println();

        System.out.println("### Juros Americano ####");
        System.out.println("Pagamento apos " + meses + " meses");
        System.out.println(String.format("%.2f", pagamentoUSA));




    }
}
