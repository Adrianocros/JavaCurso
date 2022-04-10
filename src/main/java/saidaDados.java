import java.util.Locale;

public class saidaDados {

    public static void main(String[] args) {

    double x = 10.35785;
        System.out.println(x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);

        //Marcadores impresao de varios valores interpolados
        String nome = "Adriano";
        int idade = 39;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome,idade,renda);
    }
}
