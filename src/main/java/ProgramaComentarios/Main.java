package ProgramaComentarios;

import ProgramaComentarios.Entities.Comentario;
import ProgramaComentarios.Entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Tenha uma boa viagem");
        Comentario c2 = new Comentario("Nossa que legal");

        Post p1 = new Post(sdf.parse("21/06/2021 12:10:22"),
                                "Viagem para Nova Zelandia",
                                "Vou visitar esse pais maravilhoso",
                                12);
        p1.addComentario(c1);
        p1.addComentario(c2);


        Comentario c3 = new Comentario("Tenha força meu querido");
        Comentario c4 = new Comentario("Nossa que legal");

        Post p2 = new Post(sdf.parse("20/12/2022 14:10:22"),
                "Boa noite meus amigos",
                "Vejo voces amanha",
                10);
        p2.addComentario(c3);
        p2.addComentario(c4);

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);


    }
}
