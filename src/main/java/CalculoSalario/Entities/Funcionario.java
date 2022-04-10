package CalculoSalario.Entities;

public class Funcionario {
    public String nome;
    public double salarioBruno;
    public double taxa;

    public double salarioLiguido(){
        return salarioBruno - taxa;
    }

    public void aumentarSalario(double porcentagem){
        salarioBruno += salarioBruno * porcentagem / 100;
    }

    public String toString(){
        return nome + ", R$ "  + String.format("%.2f%n", salarioLiguido());
    }

}
