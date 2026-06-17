package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.D;

import java.util.*;

public class BoletimEscolar {
    private List<Avaliacao> avaliacoes = new ArrayList<>();


    public void adicionarAvaliaçao(Avaliacao av) {
        if (!avaliacoes.contains(av)) {
            avaliacoes.add(av);
        }
    }

    public void atualizarNota(Avaliacao av, double nota) {
        if (avaliacoes.contains(av)) {
            avaliacoes.get(avaliacoes.indexOf(av)).setNota(nota);
        }
    }

    public Map<String, String> situacao() {
        Map<String, String> situacao = new TreeMap<>();
        for (Avaliacao av : avaliacoes) {
            if (av.getNota() > 6) {
                situacao.put(av.getDisciplina(), "Aprovado");
            } else {
                situacao.put(av.getDisciplina(), "Reprovado");
            }
        }
        return situacao;
    }
}

