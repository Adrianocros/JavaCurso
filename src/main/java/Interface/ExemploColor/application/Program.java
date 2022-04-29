package Interface.ExemploColor.application;

import Interface.ExemploColor.Entities.Circle;
import Interface.ExemploColor.Entities.Retangle;
import Interface.ExemploColor.Entities.Shape;
import Interface.ExemploColor.Enums.Color;


public class Program {
    public static void main(String[] args) {

        Shape s1 = new Circle(Color.BLACK,2.0);
        Shape s2 = new Retangle(Color.WHITE, 3.0,4.0);


        System.out.println("Cor do circulo: " + s1.getColor());
        System.out.println("Area do circulo: " + String.format("%.3f", s1.area()));
        System.out.println("Cor Retangulo: " + s2.getColor());
        System.out.println("Area do Retangulo: " + String.format("%.3f", s2.area()) );

    }
}
