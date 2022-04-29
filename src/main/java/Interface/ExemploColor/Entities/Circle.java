package Interface.ExemploColor.Entities;


import Interface.ExemploColor.Enums.Color;

public class Circle  extends Shape{

    private Double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
