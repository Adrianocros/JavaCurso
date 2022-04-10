import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){

//        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//        decimais

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero do funcionario: ");
        int numeroFunc = scanner.nextInt();

        System.out.print("Digite suas horas trabalhadas: ");
        int horasTrab = scanner.nextInt();

        System.out.print("Digiter o valor de sua horas: ");
        double valorHora = scanner.nextDouble();

        double salario = valorHora * horasTrab;

        System.out.println("######################################");
        System.out.println("Numero do funcionario: " + numeroFunc);
        System.out.printf("Salario = R$ %.2f%n",salario);

        scanner.close();










    }


}
