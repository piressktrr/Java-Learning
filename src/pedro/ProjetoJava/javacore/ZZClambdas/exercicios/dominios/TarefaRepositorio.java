package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TarefaRepositorio  {

    private  RepositorioEmMemoria repoMem;



    public String buscarPorTitulo(String  titulo){
        List<List> list = new ArrayList<>();

        if (repoMem.listarTodos() != null) {
            list.addAll(repoMem.listarTodos());
        }

        if (list.contains(titulo)) {
            return titulo;
        }

        return null;

    }

}
