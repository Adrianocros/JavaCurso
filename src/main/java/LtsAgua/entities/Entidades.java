package LtsAgua.entities;

public class Entidades {
    private String nome;
    private Double kg;
    private Double volume = 35.0;

    public Entidades(String nome, Double kg) {
        this.nome = nome;
        this.kg = kg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getKg() {
        return kg;
    }

    public void setKg(Double kg) {
        this.kg = kg;
    }

    public Double resultado(){
        return kg * volume;
    }

    public  String toString(){
        return "Olá, "
                + nome
                + "a quantidade de agua necessaria para você é "
                + String.format("%.1f",resultado())
                + " ml";
    }

}



