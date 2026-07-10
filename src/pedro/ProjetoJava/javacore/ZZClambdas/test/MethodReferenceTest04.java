package pedro.ProjetoJava.javacore.ZZClambdas.test;

import pedro.ProjetoJava.javacore.ZZClambdas.dominios.Anime;
import pedro.ProjetoJava.javacore.ZZClambdas.dominios.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        // supplier é uma interface funcional que eu passo um resultado e ele me retorna um resultado

        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;
        AnimeComparators animeComparators =   animeComparatorsSupplier.get();
        // aqui eu crio um objeto com supplier e dou um get em baixo com animeComparators

        List<Anime> lista = new ArrayList<>(List.of(new Anime("DBZ", 300),
                new Anime("Naruto", 200)));

        lista.sort(animeComparators::compareByEpNaoStatic);

        BiFunction<String, Integer, Anime> createAnimeByBiFunction = Anime::new;
        // e o BiFunction é a classe Function que me permite mais um argumento
        // aqui eu estou criando um novo objeto de Anime com ela,
        // e em baixo eu passo o titulo (string) e episodios (integer)

        System.out.println(createAnimeByBiFunction.apply("DBZ", 300));
        System.out.println(lista);
    }
}
