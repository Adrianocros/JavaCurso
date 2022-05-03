package GenericsSetMap.GenericsExemploTres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(5,2,3,4);
        printList(myList);
        System.out.println();

        List<String> myLists = Arrays.asList("Maria", "Marcos", "Vania");
        printList(myLists);

    }

    private static void printList(List<?> list) {
        for(Object obj : list){
            System.out.println(obj);
        }
    }
}
