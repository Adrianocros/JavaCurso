package ProgramaEstoque.Application;

import ProgramaEstoque.Entities.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Produtos produtos = new Produtos();
        System.out.print("Nome prduto: ");
        produtos.nome = scanner.nextLine();
        System.out.print("Preço produto: ");
        produtos.preco = scanner.nextDouble();
        System.out.print("Quantidade no estoque: ");
        produtos.quantidade = scanner.nextInt();

        //Converte o objeto para String
        System.out.println("Estoque do produto" + produtos);

        System.out.println("#################################################");

        //Adicionando ao estoque
        System.out.print("Entre com a quantidade para ser adicionada ao estoque: ");
        int quantidade = scanner.nextInt();
        produtos.addProdutos(quantidade);
        System.out.println("Estoque atualizado: " + produtos);

        System.out.println("#################################################");
        //Venda de produto
        System.out.print("Entre com a quantidade para ser removido ao estoque: ");
        quantidade = scanner.nextInt();
        produtos.removendoProdutos(quantidade);
        System.out.println("Estoque atualizado: " + produtos);


    }
}
