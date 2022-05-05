package ProgramacaoFuncionalELambidas.Consumer.Entities;

public class Cliente {
    private String nome;
    private Integer idade;
    private String cidade;

    public Cliente(String nome, Integer idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Cliente - "
                + "nome: " + nome
                + ", Idade: " + idade
                + ", cidade: " + cidade;
    }
}
