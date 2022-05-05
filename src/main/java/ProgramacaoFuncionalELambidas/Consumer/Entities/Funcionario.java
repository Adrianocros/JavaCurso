package ProgramacaoFuncionalELambidas.Consumer.Entities;

public class Funcionario {
    private String nome;
    private Integer idade;
    private String cidade;
    private Double salario;

    public Funcionario(String nome, Integer idade, String cidade, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.salario = salario;

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

    public Double getSalario(){
        return salario;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }

    public  void NonstaticSalarioUpdate(){
       salario = salario * 1.1;
    }

    @Override
    public String toString() {
        return "Cliente - "
                + "nome: " + nome
                + ", Idade: " + idade
                + ", cidade: " + cidade
                + ", Salario:" + salario;
    }
}
