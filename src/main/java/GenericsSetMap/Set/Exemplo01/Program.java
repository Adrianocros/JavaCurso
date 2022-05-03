package GenericsSetMap.Set.Exemplo01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");


        System.out.println(set.contains("Notebook"));

        for (String p : set){
            System.out.println(p);
        }


    }
}
