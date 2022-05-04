package GenericsSetMap.Set.Exercicio05TreeSet;

import GenericsSetMap.Set.Exercicio05TreeSet.Entities.Produto;

import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<Produto> set = new TreeSet<>();

        set.add(new Produto("Tv", 900.00));
        set.add(new Produto("Tablet", 700.00));
        set.add(new Produto("Celular", 1200.00));

        for(Produto p : set){
            System.out.println(p);
        }
    }
}
