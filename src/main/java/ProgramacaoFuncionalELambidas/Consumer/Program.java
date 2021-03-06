package ProgramacaoFuncionalELambidas.Consumer;

import ProgramacaoFuncionalELambidas.Consumer.Entities.Funcionario;
import ProgramacaoFuncionalELambidas.Consumer.util.SalarioUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Funcionario> list = new ArrayList<>();


        list.add(new Funcionario("Renato", 33, "Guarulhos",3000.0));
        list.add(new Funcionario("Ana", 17, "Guaruja",1500.0));
        list.add(new Funcionario("Leticia", 23, "Santos",1350.0));
        list.add(new Funcionario("João", 31, "São Paulo",2500.0));

        double factor = 1.1;

        //Ira percorrer a lista e aplicar o update
        list.forEach(f -> f.setSalario(f.getSalario() * factor));


        list.forEach(System.out :: println);

    }
}
