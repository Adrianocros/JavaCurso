package CalculoCircunferencia.ExemploV_03;

//Com os objetos static não ha necessidade de INSTANCIA para chamar.


import CalculoCircunferencia.ExemploV_03.Util.Calculadora;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o raio: ");
        double raio = scanner.nextDouble();

        //No lugar do objeto chama a propria CLASSE
        double c = Calculadora.circunferencia(raio);
        double v =  Calculadora.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Valor: %.2f%n", Calculadora.PI);
    }

}
