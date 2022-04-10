package Classes.Aplication;

import java.util.Locale;
import java.util.Scanner;

public class CalculoTriangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre com as dimenções do triangulo X: ");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();
        System.out.println("Entre com as dimenções do triangulo Y: ");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        //Calcula a area do Triangulo X
        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        //Calcula a area do Triangulo Y
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        //Mostra o calculo da area X e Y
        System.out.printf("A area do triangulo X: %.4f%n", areaX);
        System.out.printf("A area do triangulo Y: %.4f%n", areaY);


        //Verifica a maior area
        if(areaX > areaY) {
            System.out.println("A maior area é a area X");
        }else {
            System.out.println("A maior area é a area Y");
        }

    }


}
