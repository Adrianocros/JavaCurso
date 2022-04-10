package ExemploMetodosAbistrato.Entities;

import ExemploMetodosAbistrato.Entities.Enums.Colors;

public class Rectangle extends Shape {
   private Double largura;
   private Double altura;

   public Rectangle(){
       super();
   }


    public Rectangle(Colors colors, Double largura, Double altura) {
        super(colors);
        this.largura = largura;
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        //Area do retangulo
        return largura * altura;
    }
}
