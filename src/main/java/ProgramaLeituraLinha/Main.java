package ProgramaLeituraLinha;
//Fazer um programa para le dois numeros inteiros M e N
//Depois ler a matriz de M linhas por  N colunas
//Em seguida ler um numero inteiro X que pertence a matriz.
//Para cada  ocorrencia X mostrar os valors a esquerda acima a deireita e baixo X quando houver


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int x = scanner.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("Posição " + i + ", " + j + ": ");
                    if (j > 0) {
                        System.out.println("Esquerda: " + matrix[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + matrix[i - 1][j]);
                    }
                    if (j < matrix[i].length - 1) {
                        System.out.println("Direita: " + matrix[i][j + 1]);
                    }
                    if (i < matrix.length - 1) {
                        System.out.println("Baixo: " + matrix[i + 1][j]);
                    }
                }
            }
        }
    }
}

