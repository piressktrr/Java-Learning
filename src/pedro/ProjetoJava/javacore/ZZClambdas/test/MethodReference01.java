package pedro.ProjetoJava.javacore.ZZClambdas.test;

import pedro.ProjetoJava.javacore.ZZClambdas.dominios.Anime;
import pedro.ProjetoJava.javacore.ZZClambdas.dominios.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReference01 {

    // referencia de metodo estatica que me permite passar metodos sem ter que usar lambdas (porque não há duas condições)

    public static void main(String[] args) {

        Anime a = new Anime("DBZ", 300);
        Anime b = new Anime("Alucard", 100);


        List<Anime> lista = new ArrayList<>();


        lista.add(a);
        lista.add(b);
        AnimeComparators.compareByTitle(a, b);

//        lista.sort(AnimeComparators.compareByTitle(a.getTitle(), b.getTitle()));
        lista.sort(AnimeComparators::compareByTitle);
        System.out.println(lista);
    }
}
