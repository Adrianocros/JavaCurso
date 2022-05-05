package ProgramacaoFuncionalELambidas.Comparator.Application;

import ProgramacaoFuncionalELambidas.Comparator.Entities.Products;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        List<Products> list = new ArrayList<>();

        list.add (new Products("TV", 900.00));
        list.add (new Products("Tablet", 500.00));
        list.add (new Products("Celular", 1900.00));

        //Classe anonima e lambda
        list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

        for (Products p : list){
            System.out.println(p);
        }

    }

}
