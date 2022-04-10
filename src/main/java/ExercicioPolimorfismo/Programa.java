package ExercicioPolimorfismo;
/*Uma empresa possui funcionarios proprios e terceirizados para cada funcionario deve ser registrado

Nome - Horas Trabalhadas - Valor por Hora

Para funcionarios o pagamento corresponde ao VALOR DA HORA MULTIPLICADO PELO VALOR DAS HORAS TRABALHADAS
Para funcionarios terceirizados o pagamento corresponde ao VALOR DA HORA MULTIPLICADO PELO VALOR DAS HORAS TRABALHADAS
mais um bonus de 110% de suas despesas adicionais

Depois de ler os dados deve mostrar em uma lista o nome e o pagamento de cada funcionario

*/


import ExercicioPolimorfismo.Entities.FuncTerceiro;
import ExercicioPolimorfismo.Entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Entre com numero de funcionarios: ");
        int n = scanner.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Dados do " + i + "º funcionario: ");
            System.out.print("O funcionario é terceirizado (y/n): ");
            //Le o caracter Y ou N da pergunta
            char ch = scanner.next().charAt(0);
            System.out.print("Informe o nome do funcionario: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Horas trabalhadas: ");
            int horas = scanner.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = scanner.nextDouble();

            //Le a pergunta Y ou N
            if (ch == 'y') {
                System.out.print("Despesa adicional: ");
                double despesaAdicional = scanner.nextDouble();
                list.add(new FuncTerceiro(nome, horas, valorPorHora, despesaAdicional));
            } else {
                list.add(new Funcionario(nome, horas, valorPorHora));
            }

        }
            System.out.println();
            System.out.println("Pagamentos");
            for(Funcionario func : list){
                System.out.println(func.getNome() + " - R$ " + String.format("%.2f",func.pagamento()));


        }

    }
}
