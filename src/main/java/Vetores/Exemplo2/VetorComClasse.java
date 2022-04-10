package Vetores.Exemplo2;

//Leia um numero N e dos dados nome e preço de N produtos Armazene os N produtos em um vetor
//Em sequida mostra a media .


import Vetores.Exemplo2.Entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class VetorComClasse {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a quantide de produtos: ");
        int n = scanner.nextInt();
        Produto[] vetor = new  Produto[n];

        for(int i=0; i< vetor.length;i++){
            System.out.printf("Digite o produto:");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.printf("Digite o preço R$ ");
            double preco = scanner.nextDouble();
            vetor[i] = new Produto(nome,preco);
        }

        //Medias dos preços
        double soma = 0.0;
        for(int i=0; i < vetor.length; i++){
           soma += vetor[i].getPreco();
        }
        double media = soma / vetor.length;
        System.out.printf("A media de preços é R$ %.2f%n", media);
    }
}
