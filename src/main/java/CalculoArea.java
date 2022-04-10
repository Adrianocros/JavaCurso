import java.util.Scanner;

public class CalculoArea {


    public  static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculando a area");
        System.out.print("Digite o valor do lados A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        double c = scanner.nextDouble();

        double area = (a + b) / 2.0 * c;
        System.out.println(area);

    }

}
