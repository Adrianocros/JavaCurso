package ProgramaTriangulo;

import ProgramaTriangulo.Entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com as dimenções do triangulo X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Entre com as dimenções do triangulo Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("A area do triangulo X é : %.4f%n", areaX);
        System.out.printf("A area do triangulo Y é : %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A maior area é a area X");
        } else {
            System.out.println("A maior area é a area Y");
        }


    }
}
