package ProgramaLogDeAcesso;

import Interface.EmpPagtoOnLine.Entities.Installment;
import ProgramaLogDeAcesso.Entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o caminho do arquivo: ");
        String path = scanner.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            //HashSet - Ele é rapido e conta a quantidade de usuario sem importar com a ordem e bloqueia duplicado
            Set<LogEntry> set = new HashSet<>();

            //Lendo o arquivo
            String line = br.readLine();
            while (line != null){
                String[] filds = line.split(" ");
                String username = filds[0];
                Date moment = Date.from(Instant.parse(filds[1]));

                set.add(new LogEntry(username,moment));

                line = br.readLine();
            }
            System.out.println("Total de usuarios: " + set.size());


        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
