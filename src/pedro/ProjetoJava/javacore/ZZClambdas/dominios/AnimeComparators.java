package pedro.ProjetoJava.javacore.ZZClambdas.dominios;

import java.util.Comparator;

public class AnimeComparators {

    public static int compareByTitle(Anime o1, Anime o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }

    public int compareByEpNaoStatic(Anime o1, Anime o2) {
        return Integer.compare(o1.getQuantidadeEp(), o2.getQuantidadeEp());
    }
}
