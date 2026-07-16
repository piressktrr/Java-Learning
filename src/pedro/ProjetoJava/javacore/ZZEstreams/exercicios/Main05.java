package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Tarefa;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.TarefaRepositorio;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Main05 {
    public static void main(String[] args) {
        buscarTarefasMaisUrgentes().forEach(System.out::println);
    }

    private static List<Tarefa> buscarTarefasMaisUrgentes () {
        return TarefaRepositorio.getTarefas().stream()
                .filter(tarefa -> !tarefa.isConcluida())
                .sorted(Comparator.comparing(Tarefa::getPrazo).thenComparing((Tarefa::getPrioridade)))
                .limit(3)
                .toList();
    }
}
