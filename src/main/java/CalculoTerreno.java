import java.util.Locale;
import java.util.Scanner;

public class CalculoTerreno {

    public  static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite Largura, Comprimento e Preço do M² ");

        double largura = scanner.nextDouble();
        double comprimento = scanner.nextDouble();
        double metroQuadrado = scanner.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("Area = %.2f%n",area);
        System.out.printf("Preco = %.2f%n", preco);


    }


}
