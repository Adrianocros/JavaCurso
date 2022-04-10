package ExercicioMatriz;
//Ler um numero N e uma matriz de ordem N contem inteiros.
//Em seguida mostrar a diagonal principal e a quantidade de valores negativos da matriz


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = 3;

        //Criando a matriz 3X3
        System.out.println("Digite numeros da matriz ex.: ( 5 2 1)  ");
        int[][] matrix = new  int[n][n];

        //lenda a matriz
        //Linha l - Coluna c
        //FOR percorre linha
        for(int l=0; l< matrix.length;l++){
            //For percirre coluna
            for(int c=0; c<matrix[l].length;c++){
                matrix[l][c] = scanner.nextInt();
            }
        }

        System.out.println("Diagonal da matriz");
        for(int i=0; i<n; i++){
            System.out.println(matrix[i][i] + " ");
        }

        int cont = 0;
        for(int c= 0;c< matrix.length;c++){
            for(int l=0; l<matrix[c].length;l++){
                if (matrix[c][l]<0){
                    cont++;
                }
            }
        }
        System.out.println("Numeros negativos: " + cont);
    }

}
