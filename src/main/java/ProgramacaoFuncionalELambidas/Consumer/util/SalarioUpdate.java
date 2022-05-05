package ProgramacaoFuncionalELambidas.Consumer.util;

import ProgramacaoFuncionalELambidas.Consumer.Entities.Funcionario;

import java.util.function.Consumer;

public class SalarioUpdate implements Consumer<Funcionario> {


    //Calsse para Atualizar o salario
    @Override
    public void accept(Funcionario f) {
        f.setSalario(f.getSalario() * 1.1);

    }
}
