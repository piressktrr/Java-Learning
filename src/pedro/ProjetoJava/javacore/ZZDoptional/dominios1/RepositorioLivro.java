package pedro.ProjetoJava.javacore.ZZDoptional.dominios1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class RepositorioLivro {
    private static List<Livro> livros = new ArrayList<>(List.of(new Livro("Dostoievski", "Noites brancas"),
            new Livro("James Clear", "Habitos atomicos")));

    public Optional<Livro> findByAutor(String autor){
        return findBy(l ->  l.getAutor().equals(autor));
    }

    public Optional<Livro> findByTitle(String titulo){
        return findBy(l ->  l.getTitulo().equals(titulo));

    }

    private static Optional<Livro> findBy(Predicate<Livro> predicate){
        Livro livroAux = null;
        for (Livro livro : livros) {
            if (predicate.test(livro)) {
                livroAux = livro;
            }
        }

        return Optional.ofNullable(livroAux);
    }


    public Livro newLivro(String autor){
        Livro newLivro = new Livro(autor, "TITULO DESCONHECIDO", LocalDateTime.now(), false);
        livros.add(newLivro);
        return newLivro;

    }
}
