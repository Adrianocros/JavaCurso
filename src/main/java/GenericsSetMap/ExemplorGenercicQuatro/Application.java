package GenericsSetMap.ExemplorGenercicQuatro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args){
        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDouble = Arrays.asList(3.2,5.13,5.22);
        List<Object> myObjs = new  ArrayList<Object>();

        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDouble, myObjs);
        printList(myObjs);
    }

    private static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for(Number number : source){
            destiny.add(number);
        }
    }
    public static void printList(List<?> list){
        for(Object obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
