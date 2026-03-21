package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class ex010 {

    public static String recebeCalendar(Calendar data) {
        DateFormat BR = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pt", "BR"));
        DateFormat US = DateFormat.getDateInstance(DateFormat.FULL, Locale.ENGLISH);
        DateFormat JP = DateFormat.getDateInstance(DateFormat.FULL, Locale.JAPAN);

        return "BR: "+BR.format(data.getTime()) + ", US: "  + US.format(data.getTime()) + ", JP: "
                + JP.format(data.getTime());

    }

    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();

        data.set(Calendar.YEAR, 2026);
        data.set(Calendar.MONTH, Calendar.DECEMBER);
        data.set(Calendar.DAY_OF_MONTH, 25);

        System.out.println(recebeCalendar(data));
    }
}
