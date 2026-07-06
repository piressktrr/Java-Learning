package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositorioEmMemoria <T, ID extends Identificavel<T>> implements Repositorio<ID, T>{
    private Map<ID, T> mapa = new HashMap<>();

    @Override
    public void salvar(ID entidade) {
        if (entidade != null) {
            mapa.put(entidade, entidade.getT());
        }
    }

    @Override
    public void buscarPorId(T t) {

    }

    @Override
    public List<ID> listarTodos() {
        return List.of();
    }

    @Override
    public void deletar(T t) {

    }

    // classe 100% generica que nao sabe nada sobre o que ta recebendo

}
