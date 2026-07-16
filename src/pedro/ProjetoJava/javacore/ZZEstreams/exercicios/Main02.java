package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Tarefa;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.TarefaRepositorio;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Main02 {
    public static void main(String[] args) {
        System.out.println(existeTarefaAtrasada(TarefaRepositorio.getTarefas()));
        System.out.println(todasTarefasDoResponsavelEstaoConcluidas(TarefaRepositorio.getTarefas(), "lozang"));
        System.out.println(buscarPrimeiraTarefaCritica(TarefaRepositorio.getTarefas()));
    }

    public static boolean existeTarefaAtrasada(List<Tarefa> tarefas){
        return  tarefas.stream()
                .anyMatch(t -> t.getPrazo().isBefore(LocalDate.now()) && !t.isConcluida());

    }

    public static boolean todasTarefasDoResponsavelEstaoConcluidas(List<Tarefa> tarefas, String responsavel){
        return tarefas.stream()
                .filter(t -> t.getResponsavel().equalsIgnoreCase(responsavel)) // aqui nao seria melhor filtrar por id?
                .allMatch(Tarefa::isConcluida);
    }

    public static Optional<Tarefa> buscarPrimeiraTarefaCritica(List<Tarefa> tarefas) {
        return tarefas.stream()
                .filter(t -> t.getPrioridade() == 1)
                .findFirst();
    }
}
