package CalculoSalario;

import CalculoSalario.Entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Funcionario sal = new Funcionario();

        System.out.printf("Dados do funcionario");
        System.out.print("Nome: ");
        sal.nome = scanner.nextLine();
        System.out.print("Salario Bruno: ");
        sal.salarioBruno = scanner.nextDouble();
        System.out.print("Imposto: ");
        sal.taxa = scanner.nextDouble();

        System.out.printf("Funcionario: " + sal);
        System.out.printf(" ");

        System.out.print("Funcionario terá aumento de salario? s = 1/n = 2 : ");
        int aumento = scanner.nextInt();
        if(aumento == 1){
            System.out.printf(" ");
            System.out.print("Qual a porcentagem a ser add ao salario? ");
            double porcentagem = scanner.nextDouble();
            sal.aumentarSalario(porcentagem);
            System.out.printf("");
            System.out.printf("Dados atualizados : " + sal);
        }else {
            System.out.printf("");
            System.out.printf("Dados atualizados : " + sal);
        }









    }
}
