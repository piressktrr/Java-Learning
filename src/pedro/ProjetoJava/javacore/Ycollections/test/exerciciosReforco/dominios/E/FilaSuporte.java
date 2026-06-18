package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.E;

import java.util.*;

public class FilaSuporte {
    private Queue<Chamado> fila = new PriorityQueue<>();


    public void adicionarChamado(Chamado chamado){
        if (chamado.getId() <= 0 || chamado.getDescricao() == null || chamado.getDescricao().isBlank()){
            throw new IllegalArgumentException("Erro, id menor que 0 ou descrição nula ou vazia!");
        }

        fila.offer(chamado);
    }

    public Chamado proximoChamado() {

        return fila.peek();
    }

    public Chamado processarChamado() {
        return fila.poll();
    }

    public List<Chamado> listarEmOrdem() {
        List<Chamado> lista = new ArrayList<>();

        lista.addAll(fila);
        lista.sort(Chamado::compareTo);

        return lista;
    }


}
