package LtsAgua;

import LtsAgua.entities.Entidades;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculo de litros de agua por dia");
        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe seu Kg: ");
        Double kg = scanner.nextDouble();

        Entidades entidades = new Entidades(nome, kg);

        System.out.println(entidades);


    }
}
