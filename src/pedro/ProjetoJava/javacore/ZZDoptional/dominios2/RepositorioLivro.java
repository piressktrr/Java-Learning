package pedro.ProjetoJava.javacore.ZZDoptional.dominios2;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class RepositorioLivro {
    private static List<Livro> livros = List.of(new Livro("Dostoievski", "Noites brancas"),
            new Livro("James Clear", "Habitos atomicos"));

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
}
