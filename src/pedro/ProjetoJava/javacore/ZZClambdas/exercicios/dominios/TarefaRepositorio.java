package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios;


import java.util.*;

public class TarefaRepositorio extends RepositorioEmMemoria<Tarefa, Long>  {

    public TarefaRepositorio() {
        super();
    }


    public String buscarPorTitulo(String titulo) {
        List<Tarefa> listaTodos = listarTodos();
        for (Tarefa tarefa : listaTodos) {
            if (tarefa.getNomeTarefa().equals(titulo)) {
                return tarefa.getNomeTarefa();
            }
        }
        return null;
    }

}
