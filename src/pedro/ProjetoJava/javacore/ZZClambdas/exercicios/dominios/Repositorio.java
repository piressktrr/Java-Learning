package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios;

import java.util.List;

public interface Repositorio <T extends Identificavel<ID>, ID> {
    void salvar(T entidade);
    String buscarPorId(ID id);
    List<T> listarTodos();
    void deletar(ID id);
}
