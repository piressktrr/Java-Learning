package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Categoria;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.Tarefa;
import pedro.ProjetoJava.javacore.ZZEstreams.dominios.TarefaRepositorio;

import java.util.DoubleSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

public class Main08 {
    public static void main(String[] args) {
         Map<Categoria, DoubleSummaryStatistics> collect = TarefaRepositorio.getTarefas().stream()
                .collect(Collectors.groupingBy(Tarefa::getCategoria,
                        Collectors.summarizingDouble(Tarefa::getHorasEstimadas)));

        System.out.println("Horas estimadas por categoria: ");

         collect.forEach((k,v)->{
             System.out.println(k);
             System.out.println(v);
             System.out.println("--------------");
         });
    }
}
