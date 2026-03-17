package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.FormatadorDeData;

import java.time.LocalDateTime;

public class ex003 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        FormatadorDeData.patternBR(dt);
        System.out.println();
        FormatadorDeData.patternISO(dt);
        System.out.println();
        FormatadorDeData.patternFriendly(dt);
    }
}
