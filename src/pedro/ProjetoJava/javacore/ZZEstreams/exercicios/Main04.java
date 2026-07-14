package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Tarefa;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.TarefaRepositorio;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main04 {
    public static void main(String[] args) {

        final Map<String, Long> collect = TarefaRepositorio.getTarefas().stream()
                .collect(Collectors.groupingBy(Tarefa::getResponsavel, Collectors.counting()));

        collect.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
