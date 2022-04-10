package Salsicha.Entities;

public class Salsicha {
    private String nome;
    private Integer salsicha;


    public Salsicha(String nome, Integer salcicha) {
        this.nome = nome;
        this.salsicha = salcicha;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSalsicha() {
        return salsicha;
    }

    public void setSalsicha(Integer salsicha) {
        this.salsicha = salsicha;
    }

    public Integer resultado(){
        return salsicha * 36;
    }


    public Integer convHora(){
      return resultado() / 60;
    }

    public String toString(){
        return nome
                +", voce morreu "
                + convHora()
                +" horas";
    }


}
