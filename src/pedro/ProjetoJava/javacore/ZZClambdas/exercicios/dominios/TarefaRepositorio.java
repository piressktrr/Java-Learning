package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios;


import java.util.*;

public class TarefaRepositorio extends RepositorioEmMemoria<Tarefa, Long>  {

    public TarefaRepositorio() {
        super();
    }

    public String buscarPorTitulo(String titulo) {
        Map<Long, Tarefa> map = getMapa();

        for (Map.Entry<Long, Tarefa> entry : map.entrySet()) {
            if (entry.getValue().getNomeTarefa().equals(titulo)) {
                return entry.toString();
            }
        }
        return null;
    }

}
