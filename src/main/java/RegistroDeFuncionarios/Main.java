package RegistroDeFuncionarios;

//Ler uma lista com N funcionarios (id, nome, salario), não pode repetir o ID;
//Efeturar um almento de X% no salario de um determinado funcionario
//Mostrtar  a lista atualizada dos funcionarios


import RegistroDeFuncionarios.Funcionarios.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new  Scanner(System.in);
        List<Funcionarios> list = new ArrayList<>();

        System.out.print("Quantos funcionarios serão registrados: ");
        int n = scanner.nextInt();


        //For para incluir os funcionarios
        for( int i=0; i<n; i++){
            System.out.println();
            System.out.println("Funcionario #" + (i + 1) + " : " );
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            //Validação para não deixar digitar ID repetido.
            while (idEncontrado(list,id)){
                System.out.println("ID ja existe, tente novamente!");
                System.out.print("Id: ");
                id = scanner.nextInt();
            }
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Salario R$ ");
            Double salario = scanner.nextDouble();

            //Instanciando o funcionario
            Funcionarios func = new Funcionarios(id,nome,salario);

            //Inserindo na Lista
            list.add(func);

        }
        System.out.print("Informa o ID do usuario que irá receber o aumento : ");
        Integer idAumento = scanner.nextInt();
        //Integer pos = posicaoId(list, idAumento);
        Funcionarios func = list.stream().filter(x -> x.getId()== idAumento).findFirst().orElse(null);
        if(func == null){
            System.out.println("Este ID não foi encontrado !");
        }else {
            System.out.println();
            System.out.print("Qual porcentagem será o aumento? ");
            double porcentagem = scanner.nextDouble();
            func.aumentoSalario(porcentagem);
           // list.get(pos).aumentoSalario(porcentagem);
        }
        System.out.println();
        System.out.println("Lista de funcionarios");
        for (Funcionarios f : list ){
            System.out.println(f);
        }
    }

    //Função aux para procurar o ID na lista
    public static Integer posicaoId(List<Funcionarios> lista, int id ){
        for(int i=0; i < lista.size();i++){
            if(lista.get(i).getId() == id ){
                return i;
            }
        }
        return null;
    }

    //Função para validar se o ID existe ou não
    public static boolean idEncontrado(List<Funcionarios> list, int id){
        Funcionarios func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;
    }
}
