import java.util.Locale;
import java.util.Scanner;

//        Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos,
//        pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em
//        benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//        Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//        mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo

//        Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//        salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//        de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//        duas casas decimais


public class Exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);




        System.out.println("############# Tabela importo de Renda #############");
        System.out.println("        Salario             -   % Imposto de Renda ");
        System.out.println("___________________________________________________");
        System.out.println("de 0.00 a R$ 2000.00        -         ISENTO       ");
        System.out.println("de R$ 2000.01 a R$ 3000.00  -         08%          ");
        System.out.println("de R$ 3000.01 a R$ 4500.00  -         18%          ");
        System.out.println("acima de 4500.00            -         28%          ");
        System.out.println("___________________________________________________");
        System.out.println("###################################################");
        System.out.println("                                                    ");

        System.out.println("Digite o seu salario: ");
        System.out.println("Digite o imposto: ");

        double renda = scanner.nextDouble();

        double impostoA = 8.0 / 100;//8%
        double impostoB = 18.0 / 100;//18%
        double impostoC = 28.0 / 100;//28%



        if(renda <= 2000.0){
            System.out.println("Isento de Imposto");
        }else if ( renda <= 3000.0){
            double valImpA = (renda - 2000.0) * impostoA;
            System.out.println("Imposto a pagar R$  " + valImpA);
        }else if(renda <= 4500.0){
            double valImpB = (renda - 3000.0) * impostoB + 1000.00 * impostoA;
            System.out.println("Imposto a pagar R$ " + valImpB );
        }else {
            double valImpC = (renda - 4500.0) * impostoC + 1500.00 * impostoB + 1000.00 * impostoA;
            System.out.println("Imposto a pagar R$ " + valImpC);
        }
    }
}
