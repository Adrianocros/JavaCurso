import java.util.Scanner;

public class Exercicio18 {
//    Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
//    Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
//    1.Álcool
//    2.Gasolina
//    3.Diesel
//    4.Fim).
//    Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser
//    solicitado um novo código (até que seja válido).
//    O programa será encerrado quando o código informado for o número 4.
//    Deve ser escrito a  mensagem: "MUITO OBRIGADO" e a quantidade de clientes que
//    abasteceram cada tipo de combustível, conforme
//   exemplo
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("##################################");
        System.out.println("#### Presquisa de preferencia ####");
        System.out.println("              1.Álcool            ");
        System.out.println("              2.Gasolina          ");
        System.out.println("              3.Diesel            ");
        System.out.println("              4.Sair              ");
        System.out.println("##################################");

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.print(" Informe o combustivel abastecido:  ");

        int tipo = scanner.nextInt();

        while (tipo != 4){
            System.out.print(" Informe o combustivel abastecido:  ");
            if(tipo == 1){
                alcool = alcool + 1;
            }else if(tipo == 2 ){
                gasolina = gasolina + 1;
            }else if (tipo == 3){
                diesel = diesel + 1;
            }
            tipo = scanner.nextInt();
        }
        System.out.println("##################################");
        System.out.println("                                  ");
        System.out.println("            Obrigado              ");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        System.out.println("                                  ");
        System.out.println("##################################");

    }
}
