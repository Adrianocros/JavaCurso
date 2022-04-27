package TrabalhandoComArquivos.Arquivo;

import TrabalhandoComArquivos.Arquivo.Entities.Produto;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.print("Entre com caminho do arquivo: ");
        String sourceFileStr = scanner.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFolderStr + "\\calculo").mkdir();

        String targetFileStr = sourceFolderStr + "\\calculo\\summary.csv";


        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = br.readLine();
            while (itemCsv != null){
                //Separa a virgula no final da linha
                String[] fields = itemCsv.split(",");
                String nome = fields[0];
                double preco = Double.parseDouble(fields[1]);
                int quantidade = Integer.parseInt(fields[2]);

                list.add(new Produto(nome,preco,quantidade));
                itemCsv = br.readLine();

            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for(Produto item : list){
                    bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }
                System.out.println("CRIADO no caminho " + targetFileStr );

            }catch (IOException e){
                System.out.println("Erro ao ler o arquivo: "+ e.getMessage());
            }
        }catch (IOException e){
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

    }
}
