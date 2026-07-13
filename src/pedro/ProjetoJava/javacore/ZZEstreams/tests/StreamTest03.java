package pedro.ProjetoJava.javacore.ZZEstreams.tests;

import java.util.Arrays;
import java.util.List;

public class StreamTest03 {
    public static void main(String[] args) {
        List<String> words = List.of("Hello", "World");

        List<String> letras = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .toList();

        System.out.println(letras);
    }

}
