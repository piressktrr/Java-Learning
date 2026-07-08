package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.main;

import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios.Tarefa;

import java.time.LocalDateTime;
import java.util.List;

public class main008 {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Tarefa UM", "a", 12L, LocalDateTime.now());
        Tarefa tarefa2 = new Tarefa("Tarefa DOIS", "b", 13L, LocalDateTime.now());
        Tarefa tarefa3 = new Tarefa("Tarefa TRES", "c", 3L, LocalDateTime.now());
        Tarefa tarefa4 = new Tarefa("Tarefa QUATRO", "d", 25L, LocalDateTime.now());
        Tarefa tarefa5 = new Tarefa("Tarefa CINCO", "d", 10L, LocalDateTime.now());

        List<Tarefa> tarefas = List.of(tarefa1, tarefa2, tarefa3, tarefa4, tarefa5);

        System.out.println(gerarRelatorio(tarefas));
    }

    public static String gerarRelatorio (List<Tarefa> tarefas) {
        class Contador{
            int contagemMaiorQue10;
            int contagemIgualA10;
            int contagemContainsTres;

        }

        Contador contador = new Contador();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() > 10) {
                contador.contagemMaiorQue10++;
            } else if (tarefa.getId() == 10) {
                contador.contagemIgualA10++;
            } else if (tarefa.getNomeTarefa().contains("TRES")) {
                contador.contagemContainsTres++;
            }
        }

        return "Maior que 10: " + contador.contagemMaiorQue10 + "\n" + "Igual a 10: " + contador.contagemIgualA10 + "\n"
                + "Contém tres: " + contador.contagemContainsTres;
    }
}
