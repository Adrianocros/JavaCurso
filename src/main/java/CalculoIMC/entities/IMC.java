package CalculoIMC.entities;

public class IMC {
    private String nome;
    private Double peso;
    private Double altura;



    public IMC(String nome, Double peso, Double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }



    public Double calculoIMC(){
        return peso / (altura * altura);
    }

    public Double resultado(){
        if(calculoIMC() < 18.5){
            System.out.print("Peso Baixo");
        }else if(calculoIMC() < 24.9){
            System.out.print("Peso normal ou Adequado");
        }else if(calculoIMC() < 30){
            System.out.print("Sobrepeso");
        }else if ( calculoIMC() < 35){
            System.out.print("Obesidade grau I");
        }else if( calculoIMC() < 39.0){
            System.out.print("Obesidade grau II");
        }else
            System.out.print("Obesidade grau III ou Obesidade Morbida");
        return calculoIMC();
    }

    public String toString(){
        return ", Seu IMC é: "
                + String.format("%.2f", resultado());

    }

}
