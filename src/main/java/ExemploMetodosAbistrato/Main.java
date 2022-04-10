package ExemploMetodosAbistrato;

import ExemploMetodosAbistrato.Entities.Circle;
import ExemploMetodosAbistrato.Entities.Enums.Colors;
import ExemploMetodosAbistrato.Entities.Rectangle;
import ExemploMetodosAbistrato.Entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Shape>list = new ArrayList<>();

        System.out.print("Entre com numero de formas: ");
        int n = scanner.nextInt();

        //Lendo as figuras conforme as opções do usuario
        for(int i=1; i<=n; i++) {
            System.out.println();
            System.out.print("Forma #" + i);
            System.out.print("Retangulo ou Circulo (r/c): ");
            char ch = scanner.next().charAt(0);
            System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
            Colors colors = Colors.valueOf(scanner.next());

            if (ch == 'r') {
                System.out.print("Digite Largura: ");
                double largura = scanner.nextDouble();
                System.out.print("Digite a Altura: ");
                double altura = scanner.nextDouble();
                list.add(new Rectangle(colors, largura, altura));
            } else {
                System.out.print("Raio: ");
                double raio = scanner.nextDouble();
                list.add(new Circle(colors, raio));
            }
        }

            System.out.println();
            System.out.println("AREA DAS FORMAS");
            for(Shape shape : list){
                System.out.println(String.format("%.2f", shape.area()));
            }
    }
}
