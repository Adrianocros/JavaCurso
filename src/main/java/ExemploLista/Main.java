package ExemploLista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)  {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Adriano");
        list.add("Bob");
        list.add("Ana");
        list.add (" Miguel") ;
        list.add ("Arthur") ;
        list.add ("Heitor") ;
        list.add ("Helena") ;
        list.add ("Alice") ;
        list.add ("Theo") ;
        list.add ("Davi") ;
        list.add ("Laura") ;
        list.add ("Gabriel") ;
        list.add ("Gael") ;
        list.add ("Bernardo") ;
        list.add ("Samuel") ;
        list.add ("Valentina") ;
        list.add ("João Miguel") ;
        list.add ("Enzo Gabriel") ;
        list.add ("Heloísa") ;
        list.add ("Pedro") ;
        list.add ("Lorenzo") ;
        list.add ("Sophia") ;
        list.add ("Maria Clara") ;
        list.add ("Maria Júlia") ;
        list.add ("Maria Eduarda") ;
        list.add ("Lorena") ;
        list.add ("Lucas") ;
        list.add ("Manuela") ;
        list.add ("Cecília") ;
        list.add ("Maria Cecília") ;
        list.add ("Benício") ;
        list.add ("Júlia") ;
        list.add ("Isabella") ;
        list.add ("Lívia") ;
        list.add ("Pedro Henrique") ;
        list.add ("Maria Luiza") ;
        list.add ("Guilherme") ;
        list.add ("Maria Alice") ;
        list.add ("Joaquim") ;
        list.add ("Manuella") ;
        list.add ("Eloa") ;
        list.add ("Rafael") ;
        list.add ("João Pedro") ;
        list.add ("Antonella") ;
        list.add ("Matheus") ;
        list.add ("Isadora") ;
        list.add ("Nicolas") ;
        list.add ("Isaac") ;
        list.add ("Henrique") ;
        list.add ("Gustavo") ;
        list.add ("Benjamin") ;
        list.add ("Maite") ;
        list.add ("Anthony") ;


        //Add item apos a uma posição do elemento
        list.add(2,"Tamires");



        //Removen

        //Ver o tamanho da lista
        System.out.println(list.size());


        //Remover elemento da lista pelo nome
        System.out.println(list.remove("Maria"));

        //Remover elemento pela posição
        list.remove(1);

        for(String  x : list){
            System.out.println(x);
        }

        System.out.println("---------------------------");
        //Remover pela letra
        list.removeIf(x ->x.charAt(0) == 'T');
        for(String  x : list){
            System.out.println(x);
        }
        System.out.println("---------------------------");
        System.out.println("Index Of Bob: " + list.indexOf("Bob"));

        System.out.println("---------------------------");
        System.out.println("Filtrando quen tem o nome que inicie com A");
        List<String> reultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : reultado){
            System.out.println(x);
        }


        //Encontrar um elemento da lista que encontre o primeiro elemento que inicie com a letra A
        System.out.println("---------------------------");
        String nome = list.stream().filter(x -> x.charAt(0)== 'A').findFirst().orElse(null);
        System.out.println(nome);







    }
}
