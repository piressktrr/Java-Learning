package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ex010 {

    public static void recebeCalendar(Calendar data) {
        Calendar date = Calendar.getInstance();
        Locale locale = new Locale("jp", "JP");
        locale.setDefault(locale);
        System.out.println(date.getCalendarType());

    }

    public static void main(String[] args) {
        recebeCalendar(Calendar.getInstance());
    }
}
