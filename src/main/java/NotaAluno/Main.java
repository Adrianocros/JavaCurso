package NotaAluno;

import NotaAluno.Entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.print("Digite o nome do Estudante: ");
        estudante.nome = scanner.nextLine();
        System.out.print("Nota 1: ");
        estudante.nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        estudante.nota2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        estudante.nota3 = scanner.nextDouble();

        System.out.printf("Nota Final: %.2f%n", estudante.notaFinal());

        if(estudante.notaFinal() < 60.0){
            System.out.print("Reprovado");
            System.out.printf("Media %.2f Pontos%n ", estudante.pontosAusentes());
        }else {
            System.out.printf("Passou");
        }
    }
}
