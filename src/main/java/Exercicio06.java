//        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
//        Em seguida, calcule e mostre:
//        a) a área do triângulo retângulo que tem A por base e C por altura.
//        b) a área do círculo de raio C. (pi = 3.14159)
//        c) a área do trapézio que tem A e B por bases e C por altura.
//        d) a área do quadrado que tem lado B.
//        e) a área do retângulo que tem lados A e B

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite tres valores abaixo: ");
        double A, B, C, pi = 3.14159;

        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();


       double trianguloRetnagulo  = A * C / 2;
       double circulo = pi * C * C;
       double trapezio = (A + B)*C / 2;
       double quadrado = B * B;
       double retangulo = A * B ;


        System.out.printf("A área do triângulo retângulo %.3f%n", trianguloRetnagulo);
        System.out.printf("A área do círculo de raio %.3f%n", circulo);
        System.out.printf("A área do trapézio %.3f%n",trapezio);
        System.out.printf("A área do quadrado %.3f%n",quadrado );
        System.out.printf("A área do retângulo %.3f%n", retangulo);

    }

}
