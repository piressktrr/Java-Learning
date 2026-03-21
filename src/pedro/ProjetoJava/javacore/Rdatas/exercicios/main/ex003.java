package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.FormatadorDeData;

import java.time.LocalDateTime;

public class ex003 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Brasil: "+FormatadorDeData.patternBR(dt));
        System.out.println();
        System.out.println("ISO: " + FormatadorDeData.patternISO(dt));
        System.out.println();
        System.out.println("FRIENDLY: " + FormatadorDeData.patternFriendly(dt));
    }
}
