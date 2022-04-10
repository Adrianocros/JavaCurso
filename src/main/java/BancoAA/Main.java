package BancoAA;

import BancoAA.Entities.Conta;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Conta conta = null;

        System.out.print("Entre com numero da conta :");
        int numConta = scanner.nextInt();
        System.out.print("Entre com Nome do Correntista : ");
        scanner.nextLine();
        String nome = scanner.nextLine();
        System.out.print("Terá deposito inicia? (s/n)");
        char resp = scanner.next().charAt(0);
        if(resp == 's'){
            System.out.print("Entre com valor inicial de deposito R$ ");
            double DepInicial = scanner.nextDouble();
             ;
        }else {
            conta = new Conta(nome,numConta);
        }

        System.out.println("");
        System.out.println("#### Dados da conta #### ");
        System.out.println(conta);

        System.out.println("");
        System.out.print("Entre com valor do deposito R$  ");
        double valorDeposito = scanner.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("#### Dados da conta #### ");
        System.out.println(conta);

        System.out.print("Terá saque ? (s/n)");
        char resDois = scanner.next().charAt(0);
        if(resDois == 's'){
            System.out.println("");
            System.out.print("Entre com valor do saque R$ ");
            double valorSaque = scanner.nextDouble();
            conta.retirada(valorSaque);
            System.out.println("#### Dados da conta ####");
            System.out.println(conta);
        }else {
            System.out.println("#### VDados da conta ####");
            System.out.println(conta);
        }
    }
}
