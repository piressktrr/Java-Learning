package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Tarefa;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.TarefaRepositorio;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Main07 {
    public static void main(String[] args) {
        System.out.println("Total das horas estimadas de todas as tarefas: ");
        System.out.println(horasTotais());

        System.out.println("Maior hora estimada entre todas as tarefas: ");
        System.out.println(tarefaComMaisHorasEstimadas());

    }

    private static OptionalDouble horasTotais(){
        return TarefaRepositorio.getTarefas().stream()
                .mapToDouble(Tarefa::getHorasEstimadas)
                .reduce(Double::sum);
    }

    private static Optional<Tarefa> tarefaComMaisHorasEstimadas() {
        return TarefaRepositorio.getTarefas().stream()
                .reduce((tarefa, tarefa2) -> tarefa.getHorasEstimadas() > tarefa2.getHorasEstimadas()
                        ? tarefa : tarefa2);

    }
}
