import java.util.Locale;
import java.util.Scanner;

public class FacaEnquantoGraus {
    //Faça um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit.
    //Preguntar se o usuario deseja repetira.

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        char resp = 's';
        char tipo = 'c';

        System.out.println("Digite c para Celsius e f para Fahrenheit e s para sair: ");

        tipo = scanner.next().charAt(0);
        while (resp != 'n'){
            if(tipo == 'c'){
                System.out.print("Digite a temperatura em Graus Celsius: ");
                double C = scanner.nextDouble();
                double F = 9.0 * C / 5.0 + 32.0;
                System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
                System.out.print("Deseja repetir (s/n): ");
                resp = scanner.next().charAt(0);
            }else if(tipo == 'f'){
                System.out.print("Digite a temperatura em Graus Fahrenheit: ");
                double F = scanner.nextDouble();
                double C = (F - 32) / 1.8;
                System.out.printf("Equivalente em Celsius: %.1f%n", C);
                System.out.print("Deseja repetir (s/n): ");
                resp = scanner.next().charAt(0);
            }

        }



    }
}
