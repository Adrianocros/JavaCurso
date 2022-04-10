package Composicao.PagamentoFuncionario;

//Ler os dados de um trabalhador com N contratos(N fornecido pelo usuario).
// Depois solicitar do usuario um mes e mostrar qual foi o salario do funcionario nesse mes.

import Composicao.PagamentoFuncionario.Entities.ContratoPorHora;
import Composicao.PagamentoFuncionario.Entities.Departamento;
import Composicao.PagamentoFuncionario.Entities.Trabalhador;
import Composicao.PagamentoFuncionario.Entities.enums.NivelDeTrabalho;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com nome do departamento: ");
        String nomeDepartamento = scanner.nextLine();

        System.out.println("Dados do funcionario");
        System.out.print("Digite o nome do funcionario: ");
        String trabalhadorNome = scanner.nextLine();
        System.out.print("Nivel: ");
        String nivelTrabalhador = scanner.nextLine();
        System.out.print("Salario base R$ ");
        double salarioBase = scanner.nextDouble();

        Trabalhador trabalhador = new Trabalhador(trabalhadorNome,NivelDeTrabalho.valueOf(nivelTrabalhador), salarioBase,new Departamento(nomeDepartamento));

        System.out.print("Quantos contratos: ");
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("Entre com numero do contraro #" + i + " data: ");
            System.out.print("Entre com a data  (DD/MM/YYYY): ");
            Date contatoData = sdf.parse(scanner.next());
            System.out.print("Valor por hora R$ ");
            double valorHora = scanner.nextDouble();
            System.out.print("Duração do contrato: ");
            int horas = scanner.nextInt();
            ContratoPorHora contrato = new ContratoPorHora(contatoData,valorHora,horas);
            trabalhador.addContrato(contrato);
        }

        System.out.println();
        System.out.print("Entre com mes e ano para calcular o salario (MM/AA): ");
        String mesEAno = scanner.next();
        int mes = Integer.parseInt(mesEAno.substring(0,2));
        int ano = Integer.parseInt(mesEAno.substring(3));

        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Renda em " + mesEAno + ": " + String.format("%.2f%n", trabalhador.renda(mes,ano)));
    }
}
