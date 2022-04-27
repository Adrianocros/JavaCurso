package TrabalhandoComArquivos.InformacaoDoCaminhoArquivo;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        //Para acessar somente o nome do arquino nao o caminho completo
        System.out.println("Nome do arquivo: " + path.getName());

        //Pegando somente o caminho
        System.out.println("Nome do caminho: " +path.getParent());

        //Caminho completo
        System.out.println("Caminho completo: " + path.getPath());

    }

}
