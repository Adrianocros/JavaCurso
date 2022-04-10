package ProgramaClassificacao.Entities;

public class Classificacao {
    private Integer id;
    private String nome;
    private Double nota;
    private String pais;


    public Classificacao(Integer id, String nome, Double nota, String pais) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
        this.pais = pais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        pais = pais;
    }


    public String  toString(){
        return "ID : " + id + " - "
                + "Nome: " + nome + ", "
                + "Nota: " + nota + ".";
    }




}
