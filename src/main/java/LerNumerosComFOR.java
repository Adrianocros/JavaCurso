import java.util.Scanner;

public class LerNumerosComFOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite valores: ");
        int n = scanner.nextInt();

        int soma = 0;
        for (int i=0; i < n; i++){
            System.out.println("Digite valores: ");
            int x = scanner.nextInt();
            soma = soma + x;
        }
        System.out.println("Soma foi : " + soma);


    }


}
