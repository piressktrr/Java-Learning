package pedro.ProjetoJava.javacore.ZZEstreams.tests;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 0).forEach(System.out::println);
        IntStream integerStream = IntStream.rangeClosed(1, 5);

        System.out.println(integerStream.reduce(0, Integer::sum));
        int [] num = {1,2,3};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        try (Stream<String> linhas = Files.lines(Paths.get("D:\\javateste\\javateste\\file.txt"))) {
            linhas.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
