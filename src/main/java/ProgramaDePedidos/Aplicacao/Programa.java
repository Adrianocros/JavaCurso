package ProgramaDePedidos.Aplicacao;

import ProgramaDePedidos.Entities.Cliente;
import ProgramaDePedidos.Entities.Enuns.StatusDoPedido;
import ProgramaDePedidos.Entities.ItensDoPedido;
import ProgramaDePedidos.Entities.Pedidos;
import ProgramaDePedidos.Entities.Produtos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com dados do cliente");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Informe a data de nasc.: (DD/MM/AAAAA): ");
        Date aniversario = sdf.parse(scanner.next());

        Cliente cliente = new Cliente(nome,email,aniversario);

        System.out.println("Entre com os dados do pedido");
        System.out.print("Status: ");
        StatusDoPedido status = StatusDoPedido.valueOf(scanner.next());

        Pedidos pedidos = new Pedidos(new Date(),status, cliente);

        System.out.print("Quantos itens tera no pedido? : ");
        int N = scanner.nextInt();
        for(int i=0; i<N; i++){
            System.out.println("Entre com produto # " + (i+1));
            System.out.print("Nome do produto: ");
            scanner.nextLine();
            String produto = scanner.nextLine();
            System.out.print("Preço do produto R$ ");
            Double precoProduto = scanner.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();

            Produtos produtos = new Produtos(produto, precoProduto);

            ItensDoPedido it = new ItensDoPedido(quantidade,precoProduto,produtos);

            pedidos.addItem(it);
        }

        System.out.println();
        System.out.println(pedidos);







    }
}
