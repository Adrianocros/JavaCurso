import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero: ");

        int numero = scanner.nextInt();


        if( numero == 0){
            System.out.print("NÃO NEGATIVO " );
        }else if(numero < 0){
            System.out.printf("NEGATIVO ");
        }else {
            System.out.printf("NÃO NEGATIVO ");
        }



    }
}
