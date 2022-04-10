import java.util.Scanner;

public class ExemploSwitch {

//    Fazer um programa para ler um valor inteiro 1 a 7 representando um dia da semana(Senado 1= domingo,2=segunda etc..).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 7: ");
        int x = scanner.nextInt();
        String dia;
        switch (x){
            case 1:
                dia = "Segunda-Feira";
                break;
            case 2:
                dia = "Terça-Feira";
                break;
            case 3:
                dia = "Quarta-Feira";
                break;
            case 4:
                dia = "Quinta-Feira";
                break;
            case 5:
                dia = "Sexta-Feira";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Valor invalido";
        }
        System.out.println("Dia da semana é: " + dia);

    }

}
