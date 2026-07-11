package pedro.ProjetoJava.javacore.ZZDoptional.exercicios;

import pedro.ProjetoJava.javacore.ZZDoptional.dominios.Manga;
import pedro.ProjetoJava.javacore.ZZDoptional.dominios.MangaRepository;

public class main000 {
    public static void main(String[] args) {

       MangaRepository.findByTitle("dbz")
               .ifPresent(System.out::println);

       Manga mangaId = MangaRepository.findById(40L)
               .orElseThrow(IllegalArgumentException::new);

       System.out.println(mangaId);

       Manga mangaCriar = MangaRepository.findByTitle("akira")
               .orElseGet(() -> new Manga("akira", 1, 1995, 60L));

        System.out.println(mangaCriar);
    }


}
