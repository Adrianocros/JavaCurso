import java.util.Scanner;
//Ler um número inteiro N e calcular todos os seus divisores
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para saber os  divisores: ");
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}
