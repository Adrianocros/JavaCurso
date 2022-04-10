import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite um numero: ");

        int numero = scanner.nextInt();

        if(numero % 2 == 0 ){
            System.out.printf("PAR");
        }else if(numero % 2 != 0){
            System.out.printf("IMPAR");
        }

    }
}
