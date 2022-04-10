package ProgramaReservaHotel;

import ProgramaReservaHotel.Entities.Quarto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Quarto[] vetor = new Quarto[10];

        System.out.print("Qual querto deseja reservar? ");
        int n = scanner.nextInt();

        for(int i=0; i< vetor.length; i++){
            System.out.printf("");
            System.out.print("Reserva #" + i + " : ");
            System.out.print("Nome : ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.printf("Digite o E=mail: ");
            String email = scanner.nextLine();
            System.out.printf("Quarto : ");
            int quarto = scanner.nextInt();
            vetor[quarto] = new Quarto(nome,email);
        }

        System.out.printf("");
        System.out.println("Quarto ocupado: ");
        for(int i=0; i<10; i++){
            if(vetor[i] != null){
                System.out.printf(i + ": " + vetor[i]);
            }
        }
    }

}
