package pedro.ProjetoJava.javacore.ZZClambdas.test;

import pedro.ProjetoJava.javacore.ZZClambdas.dominios.Anime;
import pedro.ProjetoJava.javacore.ZZClambdas.dominios.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReference02 {
    // aqui é a mesma coisa do method reference normal, so que sem ser estatico

    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        Anime a = new Anime("Naruto",  399);
        Anime b = new Anime("DBZ", 250);
        List<Anime> lista = new ArrayList<>();
        lista.add(a);
        lista.add(b);

        lista.sort(animeComparators::compareByEpNaoStatic);

        System.out.println(lista);
    }
}
