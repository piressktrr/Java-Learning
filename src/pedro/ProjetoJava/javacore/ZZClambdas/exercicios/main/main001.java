package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.main;

import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios.Identificavel;
import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios.Tarefa;
import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios.TarefaRepositorio;

import java.time.LocalDateTime;

public class main001 {

    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("almoçar", "fome", 4242L, LocalDateTime.now());
        Tarefa tarefa2 = new Tarefa("correr", "exercicio", 2312L,LocalDateTime.now());

        TarefaRepositorio tarefaRepositorio = new TarefaRepositorio();

        tarefaRepositorio.salvar(tarefa1);
        tarefaRepositorio.salvar(tarefa2);
        System.out.println("--------------------------");
        System.out.println("Listando todas as tarefas.. " +tarefaRepositorio.listarTodos());
        System.out.println("Buscando por id... "+tarefaRepositorio.buscarPorId(4242L));
        System.out.println("Deletando tarefa... ");
        tarefaRepositorio.deletar(2312L);
        System.out.println("Listando todas as tarefas.. " +tarefaRepositorio.listarTodos());
        System.out.println("-----------------------");
    }
}

