package TrabalhandoComArquivos.ManipulandoPasta;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um caminho criar a pasta");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        //Pegar todas as pastar apartir do cominha digitado, gerando um vetor contendo as pastas
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("PASTAS");
        for(File folder : folders){
            System.out.println(folder);
        }
        //Lista de arquivos nao a pasta
        File[] files = path.listFiles(File::isFile);
        System.out.println("Arquivos");
        for (File file : files){
            System.out.println(file);
        }
        //Criando buspasta MKDIR apartir do diretorio
        boolean sucesso = new File(strPath + "\\subdiretorio").mkdir();
        System.out.println("Pasta criada com sucesso: " + sucesso);
    }
}
