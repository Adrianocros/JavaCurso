import java.util.Locale;

public class ExercicioSaidaDados{

    public static void main(String[] arg){

        String produto1 = "Computer";
        String produto2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products :%n %s, witch price is R$ %.2f ", produto1, price1);
        System.out.printf("%n %s, with price is R$ %.2f",produto2, price2);
        System.out.printf("%n %n Record: %d years old, code %d and gender : %c",age, code, gender );
        System.out.printf("%n %n Measue with eigth decimal places: %f", measure);
        System.out.printf("%n Rounded (three decimal places): %.3f", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("%n US decimal point %.3f",measure);


    }


}
