package GenericsSetMap.HashCodEEquals;

import GenericsSetMap.HashCodEEquals.Entities.Cliente;

public class Program {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Adriano", "adriano@gmail.com");
        Cliente c2 = new Cliente("Adriano","adriano@gmail.com");

        String s1 = "Teste";
        String s2 = "Teste";

        String s3 = new String("Teste");
        String s4 = new String("Teste");


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        //comparar por conteudo do objetos
        System.out.println(c1.equals(c2));
        //Compara a posição na memoria.
        System.out.println(c1 == c2);
        //De forma literal ele comprara o conteudo e da tratamento especial
        System.out.println(s1 == s2);
        //Aloca um espeço na memoria
        System.out.println(s3 == s4);



//        String a = "Maria";
//        String b = "Alex";
//
//        //Equals
//        System.out.println(a.equals(b));
//
//        //Hashcode
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
    }

}
