public class ExemploTernario {
    public static void main(String[] args) {

        double preco = 34.6;
       // double desconto;

        //Confição normal com IF
//        if(preco < 20.0){
//            desconto = preco * 0.1;
//        }else {
//            desconto = preco * 0.05;
//        }

//confição simplificada Ternaria
    double desconto = (preco < 20.0 ? preco * 0.1 : preco * 0.05);
        System.out.println("Valor do desconto é " + desconto);

    }

}
