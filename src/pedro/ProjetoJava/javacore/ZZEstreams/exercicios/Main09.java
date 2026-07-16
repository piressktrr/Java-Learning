package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Categoria;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Tarefa;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.TarefaRepositorio;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main09 {
    public static void main(String[] args) {

        System.out.println("Categorias por responsável: ");
        responsaveisPorCategoria().forEach((key, value) -> {
             System.out.println(key);
             System.out.println(value);
             System.out.println("--------------");
         });

    }

    private static Map<Categoria, Set<String>> responsaveisPorCategoria ( ) {
        return TarefaRepositorio.getTarefas().stream()

                .collect(Collectors.groupingBy(Tarefa::getCategoria, Collectors.mapping(Tarefa::getResponsavel,
                        Collectors.toSet())));
    }
}
