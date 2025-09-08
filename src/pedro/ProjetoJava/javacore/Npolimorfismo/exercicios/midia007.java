package pedro.ProjetoJava.javacore.Npolimorfismo.exercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Midia;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Audiobook;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Filme;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Musica;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class midia007 {
    public static void main(String[] args) {
        Midia audiobook = new Audiobook("Raiam Santos", 60.0);
        Midia filme = new Filme("Guerra dos Mundos", 120.0);
        Midia musica1 = new Musica("All The Stars", 3.52);
        Midia musica2 = new Musica("Nights", 5.00);
        Midia musica3 = new Musica("Jumpin", 1.32);

        ArrayList<Midia> musicas = new ArrayList<>();
        musicas.add(musica1);
        musicas.add(musica2);
        musicas.add(musica3);
        ArrayList<Midia> midias = new ArrayList<Midia>();

        midias.add(audiobook);
        midias.add(filme);
        midias.add(musica1);
        midias.add(musica2);
        midias.add(musica3);
        int cont = 0;

        for (Midia midia : midias) {
            if (midias.stream().filter(midia1 -> midia1.equals(musicas.get(cont))).isParallel()) {
                System.out.println(musicas);
            }


        }
    }
}
