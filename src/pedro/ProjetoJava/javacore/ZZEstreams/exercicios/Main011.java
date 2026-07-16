package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Categoria;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main011 {
    public static void main(String[] args) {
        categoriasOrdemInversaEMaisDe7Caracteres().forEach(System.out::println);
    }

    private static List<String> categoriasOrdemInversaEMaisDe7Caracteres() {
        return Stream.of(Categoria.values())
                .map(Categoria::name)
                .filter(name -> name.length() >= 7) // so pra nao ficar 2 categorias, e sim 3
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}
