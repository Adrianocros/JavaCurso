package GenericsSetMap.Map.Exemplo02;

import GenericsSetMap.Map.Exemplo02.Entities.Produto;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        Map<Produto, Double> estoque = new HashMap<>();

        Produto prd1 = new Produto("TV", 9800.00);
        Produto prd2 = new Produto("Celular", 800.00);
        Produto prd3 = new Produto("Table", 600.00);

        estoque.put(prd1,200.00);
        estoque.put(prd2,2000.00);
        estoque.put(prd3,1500.00);

        Produto produto = new Produto("TV", 9800.00);

        System.out.println("Contem a chave do produto: " + estoque.containsKey(produto));

    }
}
