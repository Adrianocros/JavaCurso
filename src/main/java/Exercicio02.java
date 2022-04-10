import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

//        Faça um programa para ler o valor do raio de um círculo,
//        e depois mostrar o valor da área deste círculo com quatro
//        casas decimais conforme exemplos.
//        Fórmula da área: area = π . raio2
//        Considere o valor de π = 3.14159

        //Alterar de , para .(Ponto)
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o valor do raio:");
        double R, A, pi = 3.14159;
        R = scanner.nextDouble();

        A = pi * R * R;

       System.out.printf("A=%.4f%n",A);



    }
}
