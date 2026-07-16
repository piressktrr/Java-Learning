package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Tarefa;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.TarefaRepositorio;

import java.util.Map;
import java.util.stream.Collectors;

public class Main04 {
    public static void main(String[] args) {
        agruparPorResponsavel().forEach((k, v) -> System.out.println(k + ": " + v));
    }

    private static Map<String, Long> agruparPorResponsavel() {
        return TarefaRepositorio.getTarefas().stream()
                .collect(Collectors.groupingBy(Tarefa::getResponsavel, Collectors.counting()));
    }
}
