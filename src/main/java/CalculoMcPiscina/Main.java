package CalculoMcPiscina;

import CalculoMcPiscina.Entities.MetrosCubicos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public  static  void  main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculo de m³ da piscina");
        System.out.print("Informe o comprimento da piscina: ");
        Double comprimento = scanner.nextDouble();

        System.out.print("Informe a largura da piscina: ");
        Double largura =scanner.nextDouble();

        System.out.print("Informe a profundidade da piscina: ");
        Double profundidade = scanner.nextDouble();


        MetrosCubicos metrosCubicos = new MetrosCubicos(comprimento,largura,profundidade);

        System.out.println(metrosCubicos);

    }
}
