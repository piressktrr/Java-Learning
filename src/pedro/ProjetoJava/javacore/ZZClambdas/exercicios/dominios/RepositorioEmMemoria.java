package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositorioEmMemoria<T extends Identificavel<ID>, ID> implements Repositorio<T, ID> {
    private final Map<ID, T> mapa = new HashMap<>();

    @Override
    public void salvar(T entidade) {
        mapa.put(entidade.getId(), entidade);
    }

    @Override
    public T buscarPorId(ID id) {
        if (mapa.containsKey(id)) {
            return mapa.get(id);
        }
        // tinha me esquecido do get, preciso melhorar nas estruturas de dados
        return null;
    }

    @Override
    public List<T> listarTodos() {
        List<T> values = new ArrayList<>();
        for (Map.Entry<ID, T> entry : mapa.entrySet()) {
            values.add(entry.getValue());
        }
        return values;
    }

    @Override
    public void deletar(ID id) {
        mapa.remove(id);
    }

    // classe 100% generica que nao sabe nada sobre o que ta recebendo

}
