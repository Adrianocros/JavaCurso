package Salsicha;

import Salsicha.Entities.Salsicha;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculo de perda de vida");
        System.out.println("A cada salsicha consumida pode reduzir a expectativa de vida de uma pessoa em 36 minutos");

        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe quantas salsichas comeu hoje: ");
        Integer salsichas = scanner.nextInt();

         Salsicha salsicha = new Salsicha(nome, salsichas);

        System.out.println(salsicha);

    }
}
