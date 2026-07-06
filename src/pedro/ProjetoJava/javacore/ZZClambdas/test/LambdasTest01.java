package pedro.ProjetoJava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdasTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("A", "B", "C");
        List<Integer> integers = List.of(1, 2, 3);

        forTeste(strings, s -> System.out.println(s));
        forTeste(integers, s -> System.out.println(s));

        // aqui é um sout pq eu tenho que usar um void por causa do consumer
    }

    public static <T> void forTeste (List<T> lista, Consumer<T> consumer) {
        for (T t : lista) {
            consumer.accept(t);
        }
    }
}
