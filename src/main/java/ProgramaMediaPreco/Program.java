package ProgramaMediaPreco;

import ProgramaMediaPreco.Entities.Produtos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o arquivo:");
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Produtos> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Produtos(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
                }
            //Somando os preços do produtos e tirando a media
           double avg = list.stream()
                   .map(p -> p.getPreco())
                   .reduce(0.0,(x,y) -> x+y)/ list.size();
            System.out.println("Media dos preços:" + String.format("%.2f", avg));

            System.out.println();

            //Nomes dos produtos com preços abaixo da media e ordenado em decrescente
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> nomes = list.stream()
                    .filter(p -> p.getPreco() < avg )
                    .map(p -> p.getNome())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            nomes.forEach(System.out::println);

            }catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
