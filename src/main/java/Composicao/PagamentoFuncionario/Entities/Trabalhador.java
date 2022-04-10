package Composicao.PagamentoFuncionario.Entities;

import Composicao.PagamentoFuncionario.Entities.enums.NivelDeTrabalho;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private NivelDeTrabalho nivel;
    private Double salarioBase;

    //Associações
    private Departamento departamento;
    private List<ContratoPorHora> contratos = new ArrayList<>();


    public Trabalhador(String nome, NivelDeTrabalho nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
        this.contratos = contratos;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelDeTrabalho getNivel() {
        return nivel;
    }

    public void setNivel(NivelDeTrabalho nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoPorHora> getCotrato() {
        return contratos;
    }
//Recebe outra lista e essa nova lista esta sendo atribuida por isso nao pode ter o setContrato nao pode ser trocada
//    public void setCotrato(List<ContratoPorHora> cotrato) {
//        this.contratos = cotrato;
//    }

    //Metodos da classe responsvel por associas o trabalhador e contrato
    public void addContrato(ContratoPorHora contrato){
        contratos.add(contrato);
    }
    public void removeContrato(ContratoPorHora contrato){
        contratos.remove(contrato);
    }

    public double renda(int ano, int mes){
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for(ContratoPorHora c : contratos){
            cal.setTime(c.getDate());
            int c_ano = cal.get(Calendar.YEAR) ;
            int c_mes = 1+  cal.get(Calendar.MONTH);
            if(ano == c_ano && mes == c_mes){
                soma += c.valorTotal();
            }
        }
        return soma;
    }

}
