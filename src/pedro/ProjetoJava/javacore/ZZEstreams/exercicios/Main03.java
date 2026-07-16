package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Categoria;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Tarefa;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.TarefaRepositorio;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main03 {
    public static void main(String[] args) {
        tarefas().forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
            System.out.println("-------------");
        });
    }

    private static Map<Categoria, List<Tarefa>> tarefas() {
        return TarefaRepositorio.getTarefas().stream()
                .collect(Collectors.groupingBy(Tarefa::getCategoria));
    }
}
