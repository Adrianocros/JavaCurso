import java.util.Scanner;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//        seguir, calcule e mostre o valor da conta a pagar




public class Exercicio11 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("COD. -- ESPESIFICACAO  --  PREÇO ");
        System.out.println("---------------------------------");
        System.out.println(" 1 -- Cachorro Quente   - R$ 4.00");
        System.out.println(" 1 -- X-Salda           - R$ 4.50");
        System.out.println(" 1 -- X-Bacon           - R$ 5.00");
        System.out.println(" 1 -- Torrada simples   - R$ 2.00");
        System.out.println(" 1 -- Refrigerante      - R$ 1.50");
        System.out.println("---------------------------------");
        System.out.print("DIGITE UM CODIGO DO ITEM: ");


        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        double total;

        if(codigo == 1){
            total = quantidade * 4.0;
        }else if(codigo == 2){
            total = quantidade * 4.50;
        }else if(codigo == 3){
            total = quantidade * 5.00;
        }else if (codigo == 4){
            total = quantidade * 2.00;
        }else {
            total = quantidade * 1.50;
        }
        System.out.printf("Total: R$ %.2f%n", total);

    }

}
