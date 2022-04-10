package ExemploMetodosAbistrato.Entities;

import ExemploMetodosAbistrato.Entities.Enums.Colors;

public abstract class Shape {
    private Colors colors;

    public Shape(){

    }

    public Shape(Colors colors) {
        this.colors = colors;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    //Não pode ser instanciada
    public abstract double area();
}
