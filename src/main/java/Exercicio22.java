import java.util.Scanner;

public class Exercicio22 {
//    Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//    segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        for(int i=0; i<n; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(y == 0){
                System.out.println("Divisao impossivel");
            }else{
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }

        }

    }


}
