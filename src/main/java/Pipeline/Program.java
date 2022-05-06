package Pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,6,7,10);
        Stream<Integer> st1 = list.stream().map(x -> x * 12);
        System.out.println(Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0,(x,y) -> x + y);
        System.out.println("Soma da Lista = " + sum);

        List<Integer> newLista = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(newLista.toArray()));


    }
}
