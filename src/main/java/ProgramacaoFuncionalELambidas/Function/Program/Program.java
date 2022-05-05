package ProgramacaoFuncionalELambidas.Function.Program;

import ProgramacaoFuncionalELambidas.Function.Entities.Cliente;
import ProgramacaoFuncionalELambidas.Function.util.UpperCaseName;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Adriano", 39));
        clientes.add(new Cliente("Tamara",35));
        clientes.add(new Cliente("Tamires",5));

        Function<Cliente, String> cli = c -> c.getNome().toUpperCase();

        //Funcao map aplica uma função a cada elemento da strem gerando uma nova strem com elementos transformados
        List<String> names = clientes.stream().map(cli).collect(Collectors.toList());

        names.forEach(System.out :: println);






    }
}

