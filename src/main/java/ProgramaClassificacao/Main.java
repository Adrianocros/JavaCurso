package ProgramaClassificacao;

import ProgramaClassificacao.Entities.Classificacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Classificacao> list = new ArrayList<>();


        System.out.print("Digite a quantidade de atletas: ");
        int quantAtletas = scanner.nextInt();

        for(int i=0; i<quantAtletas; i++ ){
            System.out.println();
            System.out.print("Atleta # " + (i + 1) + ": ");
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            System.out.print("Digite o nome do atleta: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Digite o pais: ");
            String pais = scanner.nextLine();
            System.out.print("Digite a nota: ");
            Double nota = scanner.nextDouble();

            Classificacao classf = new Classificacao(id, nome,nota,pais);

            list.add(classf);

        }
        System.out.println();
        System.out.println("Lista de atletas e notas");
        for(Classificacao f : list ){
            System.out.println(f);
        }









    }
}
