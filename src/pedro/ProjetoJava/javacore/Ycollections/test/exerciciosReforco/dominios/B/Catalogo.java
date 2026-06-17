package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.B;

import java.util.*;

public class Catalogo {
    private NavigableMap<Double, List<Filme>> catalogo = new TreeMap<>();

    public void adicionarFilme(Filme filme) {
        List<Filme> listaFilmes = catalogo.getOrDefault(filme.getNota(), new ArrayList<>());
        listaFilmes.add(filme);
        catalogo.put(filme.getNota(), listaFilmes);
    }

    public NavigableMap<Double, List<Filme>> filmesAcimaDaNota(double nota) {
        return catalogo.tailMap(nota, false);
    }

    public List<Filme> melhorFilme() {
        return catalogo.get(catalogo.lastKey());
    }

    public NavigableMap<Double, List<Filme>> filmeEntreNotas(double notaI, double notaF) {
        return catalogo.subMap(notaI, true, notaF, true);

    }
}
