package GenericsSetMap.Generics;

import GenericsSetMap.Generics.Services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.print("Quantos valores sera digitado?  ");
        int n = scanner.nextInt();

        for(int i=0; i< n; i++){
            Integer value = scanner.nextInt();
            ps.addValue(value);
        }
        ps.print();
        System.out.println("Objeto a ser digitado:  " + ps.first());

    }
}
