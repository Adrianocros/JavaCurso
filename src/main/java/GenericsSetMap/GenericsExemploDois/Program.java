package GenericsSetMap.GenericsExemploDois;

import GenericsSetMap.GenericsExemploDois.Entities.Produto;
import GenericsSetMap.GenericsExemploDois.Services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static  void main(String[] args) {
        List<Produto> list = new ArrayList<>();

        String path = "C:\\temp\\ini.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Produto(fields[0],Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Produto x = CalculationService.max(list);
            System.out.print("Maior no arquivo: ");
            System.out.println(x);
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
