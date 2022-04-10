package CalculoDeAltELargura;

import CalculoDeAltELargura.Entities.Retangulo;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Retangulo rect = new Retangulo();

        System.out.println("Entre com o Retangulo Largura e Altura");
        rect.largura = scanner.nextDouble();
        rect.altura = scanner.nextDouble();

        System.out.printf("Area = %.2f%n", rect.area());
        System.out.printf("Perimetro = %.2f%n", rect.perimetro());
        System.out.printf("A Diagonal = %.2f%n",rect.diagonal());



    }
}
