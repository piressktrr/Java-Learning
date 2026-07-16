package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Tarefa;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.TarefaRepositorio;

import java.util.Comparator;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {

        List<String> titulosNaoConcluidos = TarefaRepositorio.getTarefas().stream()
                .filter(t -> !t.isConcluida())
                .map(Tarefa::getTitulo)
                .map(String::toUpperCase)
                .sorted(Comparator.naturalOrder())
                .toList();

        System.out.println("Titulos de tarefas não concluidas: ");
        System.out.println("---------------");
        titulosNaoConcluidos.forEach(System.out::println);
        System.out.println("---------------");
    }
}
