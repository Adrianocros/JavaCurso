package ProgramacaoFuncionalELambidas.Comparator.Program;

import ProgramacaoFuncionalELambidas.Comparator.Entities.Products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Products> list = new ArrayList<>();

        list.add (new Products("TV", 900.00));
        list.add (new Products("Tablet", 500.00));
        list.add (new Products("Celular", 1900.00));

       List.sort();

        for (Products p : list){
            System.out.println(p);
        }

    }
    
}
