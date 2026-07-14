package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Tarefa;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.TarefaRepositorio;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Main05 {
    public static void main(String[] args) {
         List<Tarefa> list = TarefaRepositorio.getTarefas().stream()
                 .filter(t -> t.getPrazo().isAfter(LocalDate.now()))
                 .sorted(Comparator.comparing(Tarefa::getPrazo).thenComparing((Tarefa::getPrioridade)))
                 .limit(3)
                 .toList();

         list.forEach(System.out::println);
    }
}
