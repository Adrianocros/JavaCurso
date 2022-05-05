package ProgramacaoFuncionalELambidas.Consumer;

import ProgramacaoFuncionalELambidas.Consumer.Entities.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Cliente> list = new ArrayList<>();


        list.add(new Cliente("Renato", 33, "Guarulhos",3000.00));
        list.add(new Cliente("Ana", 17, "Guaruja",1500.00));
        list.add(new Cliente("Leticia", 23, "Santos",1350.00));
        list.add(new Cliente("João", 31, "São Paulo",2500.00));



        for(Cliente c : list){
            System.out.println(c);
        }

    }
}
