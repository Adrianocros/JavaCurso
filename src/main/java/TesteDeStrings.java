import java.util.Locale;

public class TesteDeStrings {
    public  static  void  main(String[] args){


        String original = "   Contrary to popular belief, Lorem Ipsum is not simply      ";


        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.replace("o", "YY");
        int j = original.indexOf("to");
        int i = original.lastIndexOf("not");


        String s = "Adriano Bianchi Crosoletto";
        String[] vect = s.split(" ");





        System.out.println("Original: "    +   original);
        System.out.println("toLowerCase: " +   s01);

        System.out.println("                                   ");

        System.out.println("Original: "    +   original);
        System.out.println("toUpperCase: " +   s02);

        System.out.println("                                   ");

        System.out.println("Original: "    +   original);
        System.out.println("trim: " +   s03);

        System.out.println("                                   ");

        System.out.println("Original: "    +   original);
        System.out.println("replace: " +   s04);


        System.out.println("                                   ");

        System.out.println("Original: "    +   original);
        System.out.println("indexOf TO: " +  i);

        System.out.println("                                   ");

        System.out.println("Original: "    +   original);
        System.out.println("lastIndexOf NOT: " +   j);

        System.out.println("                                   ");

        System.out.println("Original: "    +   s);
        System.out.println("split: " +   vect[0]);
        System.out.println("split: " +   vect[1]);
        System.out.println("split: " +   vect[2]);
    }
}
