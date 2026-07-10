package pedro.ProjetoJava.javacore.ZZDoptional.dominios;

import com.sun.source.tree.ReturnTree;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga("DBZ", 300, 1990, 40L),
            new Manga("Naruto", 250, 1989, 50L));


    public static Optional<Manga> findById(Long ID){
        return findByParametro(man -> man.getId().equals(ID));
    }

    public static Optional<Manga> findByTitle(String title){
        return findByParametro(man -> man.getNomeManga().equals(title));
    }


    private static  Optional<Manga> findByParametro(Predicate<Manga> testeGenerico) {
        Manga manga = null;

        for (Manga m : mangas) {
            if (testeGenerico.test(m)) {
                manga = m;
            }
        }

        return Optional.ofNullable(manga);
    }



}
