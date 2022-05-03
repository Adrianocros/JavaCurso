package GenericsSetMap.GenericsExemploUm;

import GenericsSetMap.GenericsExemploUm.Services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("Quantos valores sera digitado?  ");
        int n = scanner.nextInt();

        for(int i=0; i< n; i++){
            String value = scanner.next();
            ps.addValue(value);
        }
        ps.print();
        String x = ps.first();
        System.out.println("Objeto a ser digitado:  " + x);

    }
}
