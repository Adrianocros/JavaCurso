package TratamentoDeExcecoes.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

    metodoUm();
        System.out.println("Fim do programa, Reinicie o programa !");

    }

    public static void metodoUm(){
        System.out.println("### Inicio do metodo um");
        metodoDois();
        System.out.println("### Fim do metodo um !");
    }

    public static void metodoDois(){
        System.out.println("##### Metodo Dois Inicio#####");
        Scanner scanner = new Scanner(System.in);

        //Correção da Exceção! inicie um bloco Try Catch
        try {
            String[] vetor = scanner.nextLine().split(" ");
            int posicao = scanner.nextInt();
            //Informando 3 vetores e solicite a posição 0 1 2 para ele mostrar qual verto na posição informada
            System.out.println(vetor[posicao]);
            //Exceções
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posção invalida! ");
            //printStackTrace()  Metodo imprime na tela o rastramento do metodo
            e.printStackTrace();
            scanner.next();
        }catch (InputMismatchException e){
            System.out.println("Voce digitou LETRA, informe somene numeros!");

        }
//        Exeção com a solicitação maior que numero de vetor
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
//        at TratamentoDeExcecoes.TryCatch.Apllication.main(Apllication.java:12)


//        Exeção com a solicitação uma letra ao invez de numero
//        Exception in thread "main" java.util.InputMismatchException
//        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
//        at java.base/java.util.Scanner.next(Scanner.java:1594)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//        at TratamentoDeExcecoes.TryCatch.Apllication.main(Apllication.java:10)
        System.out.println("### Metodo dois FIM !");

    }
}
