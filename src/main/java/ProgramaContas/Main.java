package ProgramaContas;

import ProgramaContas.entities.Conta;
import ProgramaContas.entities.ContaNegocios;
import ProgramaContas.entities.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Conta cc = new Conta(11,"Adriano", 0.0);
        ContaNegocios ccn = new ContaNegocios(12,"Maria", 0.0,1000.0);

        //UPCASTING - Pegar objeto que é da subclasse e atribuir a super classe
        Conta cc1 = ccn;
        Conta cc2 = new ContaNegocios(12,"Marcos",0.0,2000.0);
        Conta cc3 = new ContaPoupanca(14,"Ana",0.0,0.01);

        //DOWNCASTIN - converter objeto da superclassee para subclasse
        ContaNegocios cc4 = (ContaNegocios) cc2;
        cc4.emprestimo(100.0);


        //Conversao de objeto para outra entidade diferente
        //ContaNegocios cc5 = (ContaNegocios) cc3;

        if(cc3 instanceof ContaNegocios){
            ContaNegocios cc5 = (ContaNegocios) cc3;
            cc5.emprestimo(100.00);
            System.out.println("Emprestimo realizado ");
        }
        if(cc3 instanceof ContaPoupanca){
            ContaPoupanca cc5 =(ContaPoupanca)cc3;
            System.out.println("Acrescentado");
        }

        //SOBREPOSIOÇÃO COM SUPER - Saque conta com taxa se saque
        Conta cc5 = new Conta(1001, "Ricardo",1000.00);
        cc5.saque(200.00);
        System.out.println("Saldo Conta "+ cc5.getSaldo());

        //SOBREPOSIOÇÃO COM SUPER - Saque conta poupança sem taxa se saque
        Conta cc6 = new ContaPoupanca(1002,"Adriano",1000.00,0.01);
        cc6.saque(200.00);
        System.out.println("Saldo conta Poupança "+cc6.getSaldo());

        //SOBREPOSIOÇÃO COM SUPER -  Saque conta negocio sem taxa se saque 5.0 + 2.0
        ContaNegocios cc7 = new ContaNegocios(1003,"Bob",1000.00,500.00);
        cc7.saque(200.0);
        System.out.println("Saque Conta Negocios " + cc7.getSaldo());


        Conta x = new Conta(1001,"Marcos",1000.00);
        Conta y = new ContaPoupanca(1002,"Tamires",1000.00,0.01);

        x.saque(50.0);
        y.saque(50.00);

        System.out.println("Conta x = " + x.getSaldo());
        System.out.println("Conta y = " + y.getSaldo());


        //Tornando a classe Conta abstract, nao deixa estanciar.
        Conta acc1 = new Conta(1001,"Adriano",1000.00);
        Conta acc2 = new ContaPoupanca(1002,"Alex", 100.00,0.01);
        Conta acc3 = new ContaNegocios(1003,"Ricardo",1100.00,200.00);

        List<Conta> list = new ArrayList<>();
        list.add(new ContaPoupanca(1001,"Adriano",100.00,0.01));
        list.add(new ContaPoupanca(1005,"Jessica",100.00,0.01));
        list.add(new ContaPoupanca(1006,"Marcos",100.00,0.01));
        list.add(new ContaNegocios(1002,"Ricardo",100.00,299.00));
        list.add(new ContaNegocios(1007,"Bob",100.00,99.00));
        list.add(new ContaNegocios(1003,"Maria",100.00,499.00));
        list.add(new ContaNegocios(1004,"Joao",100.00,699.00));

        //Depositando valores nas contas
        for(Conta acc : list){
            acc.deposito(10.00);
        }

        for(Conta acc : list){
            System.out.printf("Depositando nas contas %d: R$ %.2f%n",acc.getNumero(),acc.getSaldo());
        }

        //Somanta os valores das contas
        double soma = 0.0;
        for(Conta acc : list){
            soma += acc.getSaldo();
        }
        System.out.printf("Total dos valores das contas R$ %.2f%n", soma);

    }
}
