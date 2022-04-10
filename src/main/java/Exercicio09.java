import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite dois numeros: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(A % B ==0 || B % A == 0){
            System.out.printf("Sao Multiplos");
        }else {
            System.out.printf("Nao sao Multiplos");
        }
    }

}
