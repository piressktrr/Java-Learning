package pedro.ProjetoJava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {

    // aqui é a demonstração de como usar esse methods references com metodos que não são estaticos e
    // na verdade participam de classes padrão do java

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of("Pedro", "Ana", "Joao"));

        lista.sort(String::compareTo);
        System.out.println(lista);

        Function<String, Integer> transformStringNum = Integer::parseInt;
        Integer integer = transformStringNum.apply("10");
        System.out.println(integer);
        // aqui eu pego uma string e transformo num int usando function (interface muito util por sinal)

        BiPredicate<List<String>, String> search = List::contains;
        // e aqui eu pego uma lista e o tipo dela e faço uma busca usando test em baixo
        // se conter  a string ,   retorna true
        // e isso aqui é um predicate só que com 2 valores
        System.out.println(search.test(lista, "Pedro"));

    }
}
