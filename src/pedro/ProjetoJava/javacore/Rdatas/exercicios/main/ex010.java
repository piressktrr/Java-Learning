package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ex010 {

    public static void recebeCalendar(Calendar data) {
        DateFormat BR = DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault());
        DateFormat US = DateFormat.getDateInstance(DateFormat.FULL, Locale.ENGLISH);
        DateFormat JP = DateFormat.getDateInstance(DateFormat.FULL, Locale.JAPAN);

        System.out.println(BR.format(data.getTime()));
        System.out.println(US.format(data.getTime()));
        System.out.println(JP.format(data.getTime()));

    }

    public static void main(String[] args) {

        recebeCalendar(Calendar.getInstance());
    }
}
