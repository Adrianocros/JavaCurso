package Produtos;

import Produtos.Entities.Produto;
import Produtos.Entities.ProdutoImportado;
import Produtos.Entities.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Entre com a quantidade de produtos: ");
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println( );
            System.out.print("Produto Comum, Usado, Importado (c/u/i): ");
            char ch = scanner.next().charAt(0);
            System.out.print("Nome do produto:");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Digite o preço R$ ");
            Double preco = scanner.nextDouble();


            if(ch == 'c'){
                list.add(new Produto(nome,preco));
            }else if(ch == 'u'){
                System.out.print("Informe a data de fabricação: ");
                Date dataDeFabricacao = sdf.parse(scanner.next());
                list.add(new ProdutoUsado(nome,preco,dataDeFabricacao));
            }else if(ch == 'i') {
                System.out.print("Informe a taxa alfandegaria R$ ");
                Double taxaAlfandegaria = scanner.nextDouble();
                list.add(new ProdutoImportado(nome,preco,taxaAlfandegaria));
            }
        }

        //Retorno da Etiqueta
        System.out.println();
        System.out.println("Etiqueta de preço:");
        for(Produto prod : list){
            System.out.println(prod.etiquetaDePreco());
        }

    }

}
