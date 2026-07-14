package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Tarefa;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.TarefaRepositorio;

import java.util.stream.DoubleStream;

public class Main07 {
    public static void main(String[] args) {
        System.out.println("Total das horas estimadas de todas as tarefas: ");
        TarefaRepositorio.getTarefas().stream()
                .mapToDouble(Tarefa::getHorasEstimadas)
                .reduce(Double::sum)
                .ifPresent(System.out::println);


        System.out.println("Maior hora estimada entre todas as tarefas: ");
        TarefaRepositorio.getTarefas().stream()
                .mapToDouble(Tarefa::getHorasEstimadas)
                .reduce(Double::max)
                .ifPresent(System.out::println);

    }
}
