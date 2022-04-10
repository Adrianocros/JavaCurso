package TratamentoDeExcecoes.BlocoFinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//É um bloco que contem o codigo a ser executo independentemente de ter ocorrido ou nao um exceção


public class Application {
    public static void main(String[] args) {

        File file = new File("C:\\Util\\letra.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
            //Independente se abri ou não o arquivo ele tem que fechar o arquivo e ser executado!
        }finally {
            if(sc != null){
                sc.close();
            }
            System.out.println("###########");
            System.out.println("Bloco Finnally executado ");
        }
    }
}
