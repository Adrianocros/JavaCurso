import java.util.Scanner;

public class Horas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as horas: ");
        int horas = scanner.nextInt();

        if(horas <= 12){
            System.out.printf("Bom dia !");
        }else if(horas  < 18){
            System.out.printf("Boa tarde !");
        }else {
            System.out.printf("Boa Noite !");
        }
    }
}
