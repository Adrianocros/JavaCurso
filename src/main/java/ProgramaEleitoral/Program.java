package ProgramaEleitoral;

import ProgramaEleitoral.Entities.Candidato;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        List<Candidato> list = new ArrayList<>();
        int i;
        System.out.println("##### Sistema de votação #####");

        FileWriter arq = new FileWriter("c:\\temp\\voto.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        System.out.print("Informe a quantidade de eleitores: ");
        Integer n = ler.nextInt();

        try (BufferedWriter bf = new BufferedWriter(arq)) {
            for ( i=0; i<n; i++) {
                ler.nextLine();
                System.out.print("Candidato # " + (i + 1) + " - Voto: ");
                String voto = ler.next();
                gravarArq.println("Candidato: "+  voto);

                Candidato candidato = new Candidato(voto);

                list.add(candidato);
            }
        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

        arq.close();

        System.out.printf("\n %d Votos  foram  gravada com sucesso em \"c:\\temp\\voto.txt\".\n", n);
    }

}