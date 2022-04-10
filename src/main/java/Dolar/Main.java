package Dolar;

//Faça um programa para ler a cotação do dolar, e depis um valor em dolar a ser comprado por uma pessoa em reais
//Informar quantos reais a pessaos vai pagar pelos dolares, considerando o valor de 6% da IOF.
//Criar uma classe que sera responsavel pelos calculos.

import Dolar.Utilities.Calculos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Calculos calc = new Calculos();


        System.out.printf("Digite o valor do dolar R$ ");
        calc.valorDolar = scanner.nextDouble();


        System.out.printf("Digite a quantidade que quer comprar R$  ");
        calc.quantCompra = scanner.nextDouble();

          System.out.printf("Ira pagar R$ %.2f%n ",calc.pagar());

    }
}
