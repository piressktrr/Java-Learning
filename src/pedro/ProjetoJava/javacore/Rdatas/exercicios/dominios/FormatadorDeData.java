package pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class FormatadorDeData {
    private static final DateTimeFormatter BR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter ISO =  DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
    private static final DateTimeFormatter FRIENDLY = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy",
            new Locale("pt", "BR"));

    public static String patternBR(LocalDateTime localDateTime) {
        if (localDateTime == null)
            return "";
        return BR.format(localDateTime);
    }

    public static String patternISO (LocalDateTime localDateTime) {
        if (localDateTime == null)
            return "";
        return ISO.format(localDateTime);
    }

    public static String patternFriendly (LocalDateTime localDateTime) {
        if (localDateTime == null)
            return "";
        return FRIENDLY.format(localDateTime);
    }
}
