package TrabalhandoComDataHora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        //Acrescentando 4 horas a data d
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY,4);
        cal.add(Calendar.DAY_OF_MONTH,3);
        d = cal.getTime();

        //Pegando unidade de tempo
        int minutos = cal.get(Calendar.MINUTE);
        int mes = 1 + cal.get(Calendar.MONTH);

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0l);

        Date y1 = sdf1.parse("14/11/1982");
        Date y2 = sdf2.parse("14/11/2022 15:42:07");

        System.out.println("y1: " + sdf1.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("Data Atual: " + x1);
        System.out.println("Data Atual: " + x2);
        System.out.println("Data Ol: " + x3);
        System.out.println("--------------------------------");
        System.out.println(sdf3.format(d));
        System.out.println("Minutos : " + minutos);
        System.out.println("Mes : " + mes);


    }
}
