package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.main;

import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios.Tarefa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main005 {
    public static void main(String[] args) {
        // vou fazer comparando os nomes em ordem alfabetica
        Tarefa tarefa1 = new Tarefa("Tarefa A", "TIPO C", 40L,LocalDateTime.now());
        Tarefa tarefa2 = new Tarefa("Tarefa A", "TIPO B", 41L,LocalDateTime.now());
        Tarefa tarefa3 = new Tarefa("Tarefa C", "TIPO A", 42L, LocalDateTime.now());
        List<Tarefa> tarefasBruta = new ArrayList<>();

        tarefasBruta.add(tarefa1);
        tarefasBruta.add(tarefa2);
        tarefasBruta.add(tarefa3);
        List<Tarefa> tarefasComparator = new ArrayList<>(tarefasBruta);
        List<Tarefa> tarefasLambda = new ArrayList<>(tarefasBruta);
        List<Tarefa> tarefasThenComparing = new ArrayList<>(tarefasBruta);


        System.out.println("-------------------------");
        Comparator<Tarefa> comparadorBruto = new Comparator<Tarefa>() {
            @Override
            public int compare(Tarefa t1, Tarefa t2) {
                return t1.getNomeTarefa().compareTo(t2.getNomeTarefa());
            }
        };
        tarefasBruta.sort(comparadorBruto);
        for (Tarefa tarefa : tarefasBruta) {
            System.out.println(tarefa);
        }
        System.out.println("-------------------------");

        tarefasLambda.sort((t1, t2) -> t1.getNomeTarefa().compareTo(t2.getNomeTarefa()));
        for (Tarefa tarefa : tarefasLambda) {
            System.out.println(tarefa);
        }
        System.out.println("-------------------------");

        tarefasComparator.sort(Comparator.comparing(Tarefa::getNomeTarefa).reversed());
        for (Tarefa tarefa : tarefasComparator) {
            System.out.println(tarefa);
        }
        System.out.println("-------------------------");

        Comparator<Tarefa> tComp = Comparator
                .comparing(Tarefa::getNomeTarefa)
                .thenComparing(Tarefa::getTipoTarefa);

        tarefasThenComparing.sort(tComp);
        for (Tarefa tarefa : tarefasThenComparing) {
            System.out.println(tarefa);
        }

    }
}
