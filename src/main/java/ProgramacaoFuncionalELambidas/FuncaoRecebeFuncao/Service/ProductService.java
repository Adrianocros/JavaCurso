package ProgramacaoFuncionalELambidas.FuncaoRecebeFuncao.Service;

import ProgramacaoFuncionalELambidas.FuncaoRecebeFuncao.Entities.Product;

import java.util.List;

public class ProductService {

    public double filterSum(List<Product> list ){
        double sum = 0.0;

        for(Product p : list){
            if(p.getNome().charAt(0) == 'T'){
                sum += p.getPreco();
            }
        }
        return sum;
    }
}
