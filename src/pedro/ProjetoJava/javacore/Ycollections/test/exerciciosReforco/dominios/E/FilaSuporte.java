package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.E;

import java.util.*;

public class FilaSuporte {
    private Queue<Chamado> fila = new PriorityQueue<>();
    private PriorityQueue<Chamado> teste = new PriorityQueue<>();


    public void adicionarChamado(Chamado chamado){
        if (chamado.getId() < 0 || chamado.getDescricao() == null || chamado.getDescricao().isEmpty()){
            throw new IllegalArgumentException("Erro, id menor que 0 ou descrição nula ou vazia!");
        }

        fila.offer(chamado);
    }

    public void proximoChamado() {

    }

    public Chamado processarChamado() {
        return fila.poll();
    }

    public List<Chamado> listarEmOrdem() {
        List<Chamado> lista = new ArrayList<>();
        Queue<Chamado> filaTeste = this.fila;

        while(!filaTeste.isEmpty()){
            lista.add(filaTeste.poll());
        }

        return lista;
    }


}
