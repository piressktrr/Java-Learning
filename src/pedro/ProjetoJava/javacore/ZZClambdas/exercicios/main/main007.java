package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.main;

import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios.Tarefa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class main007 {
    public static void main(String[] args) {

        // estou evitando de fazer tarefas atrasadas e etc pra não ter que ficar recriando a classe

        Tarefa tarefa = new Tarefa("T1", "Teste", 1L, LocalDateTime.now());
        Tarefa tarefa1 = new Tarefa("T2", "Teste", 2L, LocalDateTime.now());
        Tarefa tarefa2 = new Tarefa("T3", "Teste", 6L, LocalDateTime.now());
        List<Tarefa> tarefaList = new ArrayList<>();

        tarefaList.add(tarefa);
        tarefaList.add(tarefa1);
        tarefaList.add(tarefa2);

        processar(tarefaList, t -> t.getId() < 5, t -> t.getNomeTarefa().toUpperCase(),
                t -> System.out.println(t));


        processar(tarefaList, t -> !t.getNomeTarefa().contains("2"), t -> t.getNomeTarefa().toUpperCase(),
                t -> System.out.println(t));
    }

    public static void processar(List<Tarefa> tarefas, Predicate<Tarefa> filtro, Function<Tarefa, String> transformador,
                                 Consumer<String> acao) {

        for (Tarefa tarefa : tarefas) {
            if (filtro.test(tarefa)) {
                String obj = transformador.apply(tarefa);
                acao.accept(obj);
            }
        }
    }
}
