package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Categoria;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Tarefa;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.TarefaRepositorio;

import java.util.DoubleSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

public class Main08 {
    public static void main(String[] args) {
        System.out.println("Horas estimadas por categoria: ");

        horasEstimadas().forEach((k,v)->{
            System.out.println(k);
            System.out.println(v.getSum());
            System.out.println("--------------");
        });

    }

    private static Map<Categoria, DoubleSummaryStatistics> horasEstimadas () {
        return TarefaRepositorio.getTarefas().stream()
                .collect(Collectors.groupingBy(Tarefa::getCategoria,
                        Collectors.summarizingDouble(Tarefa::getHorasEstimadas)));
    }
}
