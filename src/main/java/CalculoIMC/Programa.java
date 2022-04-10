package CalculoIMC;

import CalculoIMC.entities.IMC;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner =new Scanner(System.in);

        System.out.println("Calculo de IMC");
        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe seu peso: ");
        Double peso = scanner.nextDouble();

        System.out.print("Digite seu altura: ");
        Double altura = scanner.nextDouble();

        IMC imc = new IMC(nome, peso, altura);

        System.out.println(imc);


    }
}
