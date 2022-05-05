package ProgramacaoFuncionalELambidas.Function.util;

import ProgramacaoFuncionalELambidas.Function.Entities.Cliente;

import java.util.Locale;
import java.util.function.Function;

public class UpperCaseName implements Function<Cliente, String> {


    @Override
    public String apply(Cliente cliente) {
        return cliente.getNome().toUpperCase();
    }
}
