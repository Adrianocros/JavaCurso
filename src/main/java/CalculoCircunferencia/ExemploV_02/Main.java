package CalculoCircunferencia.ExemploV_02;

//Calsse Calculadora com menbros de instancia, sendo necessario instanciar o objeto

import CalculoCircunferencia.ExemploV_02.Util.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //Obejot instanciado
        Calculadora calc = new Calculadora();

        System.out.print("Entre com o raio: ");
        double raio = scanner.nextDouble();

        //Chamada do objeto apartir da instancia
        double c = calc.circunferencia(raio);
        double v =  calc.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Valor: %.2f%n", calc.PI);
    }

}
