package pedro.ProjetoJava.javacore.ZZEstreams.tests;

import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {


        sumStreamIterate(10_000_9999L);
    }

    private static void sumStreamIterate(Long num) {
        System.out.println("sumStreamIterate ");

        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i+1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
