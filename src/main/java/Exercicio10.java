import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
//    Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//    começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a hora inicial e final do jogo: ");

        double horaInicial = scanner.nextDouble();
        double horaFinal = scanner.nextDouble();

        double duracao;

        if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.printf("Jogo durou: " + duracao + " horas(s)");
    }

}
