package ExemploMetodosAbistrato.Entities;

import ExemploMetodosAbistrato.Entities.Enums.Colors;

public class Circle extends Shape {
    private Double raio;

    public Circle(){
        super();
    }


    public Circle(Colors colors, Double raio) {
        super(colors);
        this.raio = raio;
    }


    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio *  raio ;
    }
}
