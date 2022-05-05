package ProgramacaoFuncionalELambidas.Consumer;

import ProgramacaoFuncionalELambidas.Consumer.Entities.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Cliente> list = new ArrayList<>();


        list.add(new Cliente("Renato", 33, "Guarulhos"));
        list.add(new Cliente("Ana", 17, "Guaruja"));
        list.add(new Cliente("Leticia", 23, "Santos"));
        list.add(new Cliente("João", 31, "São Paulo"));



        for(Cliente c : list){
            System.out.println(c);
        }

    }
}
