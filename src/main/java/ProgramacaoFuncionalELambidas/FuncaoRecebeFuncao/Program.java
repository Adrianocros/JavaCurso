package ProgramacaoFuncionalELambidas.FuncaoRecebeFuncao;

import ProgramacaoFuncionalELambidas.FuncaoRecebeFuncao.Entities.Product;
import ProgramacaoFuncionalELambidas.FuncaoRecebeFuncao.Service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();


      products.add(new Product("Tv", 100.00));
      products.add(new Product("Tablet", 160.00));
      products.add(new Product("Celular", 1200.00));

        ProductService ps = new ProductService();

        double sum = ps.filterSum(products, p -> p.getNome().charAt(0) == 'T');

        System.out.println("Soma R$ " + String.format("%.2f",sum));


    }
}
