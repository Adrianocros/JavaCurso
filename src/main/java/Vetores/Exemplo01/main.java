package Vetores.Exemplo01;

//Leia 3 alturar e armazene em um ventor e calcule a altrua media das alturas

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alturas que deseja tira a media: ");
        int n = scanner.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<n; i++){
            System.out.printf("Digite a altura: ");
            vect[i] = scanner.nextDouble();
        }
        double soma = 0.0;
        for (int i=0; i<n; i++){
            soma += vect[i];
        }
        double avg = soma / n;
        System.out.printf("A media de alura é : %.2f%n ", avg);
    }


}
