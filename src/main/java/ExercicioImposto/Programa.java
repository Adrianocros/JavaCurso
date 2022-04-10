package ExercicioImposto;

import ExercicioImposto.Entities.Companhia;
import ExercicioImposto.Entities.Contribuinte;
import ExercicioImposto.Entities.Individual;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Entre com numeros de Contribuintes: ");
        int n = scanner.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println();
            System.out.print(i +"º Contribuinte");
            System.out.print("Individual ou companhia (i/c): ");
            char ch = scanner.next().charAt(0);
            System.out.print("Entre com nome:");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Informe a renda anual R$ ");
            Double renda = scanner.nextDouble();

            if(ch == 'i'){
                System.out.print("Infome as Despesas de saúde R$ ");
                Double despesaComSaude = scanner.nextDouble();
                list.add(new Individual(nome,renda,despesaComSaude));
            }else {
                System.out.print("Informe o numero de funcionarios: ");
                int numeroDeFuncionarios = scanner.nextInt();
                list.add(new Companhia(nome,renda,numeroDeFuncionarios));
            }
        }

        double soma = 0.0;
        System.out.println();
        System.out.println("Taxa de Impostos");
        for(Contribuinte contribuinte : list){
            double taxa = contribuinte.taxa();
            System.out.println(contribuinte.getNome() + ": R$ " + String.format("%.2f",taxa));
            soma += taxa;
        }
        System.out.println();
        System.out.println("Total Taxa R$ " + String.format("%.2f",soma));


    }
}
