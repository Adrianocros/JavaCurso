package Interface.LerEOrdenar.Entities;

public class Funcionario implements Comparable<Funcionario> {
    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    //compareTo Compara um objeto com outro
    @Override
    public int compareTo(Funcionario other) {
        return -salario.compareTo(other.getSalario());
    }
}
