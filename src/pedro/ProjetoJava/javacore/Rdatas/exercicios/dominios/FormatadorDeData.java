package pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatadorDeData {
    public static void patternBR(LocalDateTime localDateTime) {

        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(localDateTime));
    }

    public static void patternISO (LocalDateTime localDateTime) {
        System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd 'T'HH:mm:ss").format(localDateTime));
    }

    public static void patternFriendly (LocalDateTime localDateTime) {

        System.out.println(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy").format(localDateTime));
    }
}
