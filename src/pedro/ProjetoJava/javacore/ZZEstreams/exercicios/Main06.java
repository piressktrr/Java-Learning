package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Tarefa;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.TarefaRepositorio;

import java.util.stream.Collectors;

public class Main06 {
    public static void main(String[] args) {
        System.out.println(listarTitulosPrioridadeMaximaFormatado());
    }

    private static String listarTitulosPrioridadeMaximaFormatado () {
        return TarefaRepositorio.getTarefas().stream()
                .filter(t -> t.getPrioridade() == 1)
                .map(Tarefa::getTitulo)
                .collect(Collectors.joining("] [", "[", "]"));
    }
}
