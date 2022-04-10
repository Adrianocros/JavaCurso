package CalculoCircunferencia.ExemploV_01;

//V_01 - Metodo na propria classe do programa todos STATIC

import java.util.Locale;
import java.util.Scanner;


public class ExemploV_01 {

    //Membo estatico final > valor que nao muda é constante.
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        //Função tem objetivo de calcular e devolver o valor
        double c = circunferencia(raio);

        //Função para calcular o volume
        double v = volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Valor: %.2f%n", PI);

    }

    public static  double circunferencia(double raio){
        return 2 * PI * raio;
    }

    public static double volume(double raio){
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
