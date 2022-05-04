package GenericsSetMap.Set.Exemplo04Comparacao;

import GenericsSetMap.Set.Exemplo04Comparacao.Entities.Produto;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<Produto> set = new HashSet<>();

        set.add(new Produto("TV", 900.00));
        set.add(new Produto("Tablet",1200.00));
        set.add(new Produto("Celular", 3000.00));

        Produto produto = new Produto("TV", 900.00);
        System.out.println(set.contains(produto));

    }
}
