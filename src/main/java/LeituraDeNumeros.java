import java.util.Scanner;

public class LeituraDeNumeros {

    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os numeros e 0(zero) para parar");
        int x = scanner.nextInt();

        int soma = 0;
        while (x!= 0){
            soma += + x;
            x = scanner.nextInt();
        }
        System.out.print("O valor total digitado foi :" + soma);
    }


}
