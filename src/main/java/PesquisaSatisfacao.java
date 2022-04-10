import java.util.Scanner;

public class PesquisaSatisfacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("########################");
        System.out.println(" Pesquisa de satistação ");
        System.out.println(" 1 - Otimo ");
        System.out.println(" 2 - Bom   ");
        System.out.println(" 3 - Ruim  ");
        System.out.println("########################");

        System.out.println("                         ");
        System.out.print("Informe a dua satisfação: ");

        int otimo = 0;
        int bom = 0;
        int ruim = 0;

        int satisfacao = scanner.nextInt();
        while (satisfacao !=4){
            System.out.println("########################");
            System.out.println(" Pesquisa de satistação ");
            System.out.println(" 1 - Otimo ");
            System.out.println(" 2 - Bom   ");
            System.out.println(" 3 - Ruim  ");
            System.out.println("##########################");
            System.out.println("                         ");
            System.out.print("Informe a dua satisfação: ");

            if(satisfacao == 1){
                otimo = otimo + 1;
            }else if (satisfacao == 2){
                bom = bom + 1;
            }else if (satisfacao == 3){
                ruim = ruim + 1;
            }
            satisfacao = scanner.nextInt();
        }
        System.out.println("##########################");
        System.out.println("      Resultado         ");
        System.out.println(" Otimo: " + otimo);
        System.out.println(" Bom:   " + bom);
        System.out.println(" Ruim:  " + ruim);
        System.out.println("                         ");
        System.out.println("##########################");

    }
}
