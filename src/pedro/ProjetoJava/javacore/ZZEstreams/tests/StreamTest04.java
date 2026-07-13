package pedro.ProjetoJava.javacore.ZZEstreams.tests;

import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);

        System.out.println(list.stream().reduce(0, Integer::sum));
        System.out.println(list.stream().reduce(1, (x, y) -> x * y));
        System.out.println(list.stream().reduce(0, Integer::max));
        System.out.println(list.stream().reduce(0, Integer::min));
    }
}
