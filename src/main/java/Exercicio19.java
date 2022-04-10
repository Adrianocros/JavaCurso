import java.util.Scanner;

public class Exercicio19 {

//    Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha,
//    inclusive o  X, se for o caso.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor 0 a 1000: ");

        int x = scanner.nextInt();
        for(int i=0;i<=x;i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }


    }
}
