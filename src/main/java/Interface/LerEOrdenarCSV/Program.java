package Interface.LerEOrdenarCSV;

import Interface.LerEOrdenar.Entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List<Funcionario> list = new ArrayList<>();
        String path = "C:\\temp\\funcionario.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String funcionarioCsv = br.readLine();
            while (funcionarioCsv != null){
                //Cria um vetor de posição e divide por virgula
                String[] fields = funcionarioCsv.split(",");
                list.add(new Funcionario(fields[0],Double.parseDouble(fields[1])));
                funcionarioCsv = br.readLine();
            }
            Collections.sort(list);
            for (Funcionario s : list){
                System.out.println(s.getNome() + ", " + s.getSalario());
            }
        }catch (IOException e){
            System.out.println("Erro : " + e.getMessage());
        }

    }
}
