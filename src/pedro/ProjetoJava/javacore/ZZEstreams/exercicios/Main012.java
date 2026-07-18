package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class Main012 {
    public static void main(String[] args) {
        prazosFuturos3Dias().forEach(System.out::println);
    }

    private static List<LocalDate> prazosFuturos3Dias () {
        return Stream.iterate(LocalDate.now(), i -> i.plusDays(3))
                .limit(5)
                .toList();

    }
}
