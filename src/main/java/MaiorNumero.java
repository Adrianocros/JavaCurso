import java.util.Scanner;

//Criando função

public class MaiorNumero {

    public  static  void  main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Difite 3 numeros para saber o maior:");
         int a = scanner.nextInt();
         int b = scanner.nextInt();
         int c = scanner.nextInt();

         int maior = max(a, b, c);
         resultado(maior);

    }

    public static int max(int x, int y, int z){
        int aux;
        if( x > y && x > z){
            aux = x;
        }else if( x > z ){
            aux = y;
        }else {
            aux = z;
        }
        return aux;
    }

    public static void resultado(int valor){
        System.out.println("Maior: " + valor);
    }


}
