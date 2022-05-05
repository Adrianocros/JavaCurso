package ProgramacaoFuncionalELambidas.Predicate.Util;

import ProgramacaoFuncionalELambidas.Predicate.Entities.Product;
import java.util.function.Predicate;

public class ProductPredicat  implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPreco() >= 100.0;
    }
}
