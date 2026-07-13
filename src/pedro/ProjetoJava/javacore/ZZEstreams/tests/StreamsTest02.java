package pedro.ProjetoJava.javacore.ZZEstreams.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest02 {
    public static void main(String[] args) {
        List<List<String>> cupulaDoMal = new ArrayList<>();
        List<String> g1 = List.of("Joao", "Pedro", "Marques");
        List<String> g2 = List.of("Alecrim", "Leo", "Magno");

        cupulaDoMal.add(g1);
        cupulaDoMal.add(g2);

        cupulaDoMal.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
