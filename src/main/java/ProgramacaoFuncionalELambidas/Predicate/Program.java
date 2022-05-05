package ProgramacaoFuncionalELambidas.Predicate;

import ProgramacaoFuncionalELambidas.Predicate.Entities.Product;
import ProgramacaoFuncionalELambidas.Predicate.Util.ProductPredicat;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.00));
        list.add(new Product("Table",700.00));
        list.add(new Product("Celulas",1900.00));
        list.add(new Product("HD", 80.00));
        list.add(new Product("Mouse",50.00));

        //Referencia para metodo
        list.removeIf(Product :: NostaticProductPredicate);

        for (Product p : list){
            System.out.println(p);
        }
    }
}
