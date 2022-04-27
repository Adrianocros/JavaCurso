package TrabalhandoComArquivos.EscrevendoArquivos.FileWriterEBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[]{"############","Olá", "Meu nome é Adriano", "Curso Java completo!"};
        String path = "c:\\temp\\out.txt";
        //True no final ele nao recria o arquivo ele somente reescreve
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();

            }
            System.out.println("Arquivo criado com sucesso !");
            }catch (IOException e){
            e.printStackTrace();
        }

    }
}
