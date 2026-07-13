package pedro.ProjetoJava.javacore.ZZDoptional.exercicios;

import pedro.ProjetoJava.javacore.ZZDoptional.dominios1.Livro;
import pedro.ProjetoJava.javacore.ZZDoptional.dominios1.LivroException;
import pedro.ProjetoJava.javacore.ZZDoptional.dominios1.RepositorioLivro;


public class main001 {
    public static void main(String[] args) {
        RepositorioLivro repositorioLivro = new RepositorioLivro();
        Livro livro = new Livro("Dostoievski", "Memorias do subsolo");

        repositorioLivro.findByAutor(livro.getAutor()).ifPresentOrElse(
                l -> System.out.println("Titulo encontrado: " +l.getTitulo())
                , () -> System.out.println("NÃO TEM TITULO"));

        try {
            System.out.println(repositorioLivro.findByTitle("Habitos Atomicos").orElseThrow(
                    LivroException::new));
        } catch (LivroException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(repositorioLivro.findByAutor("Ivan Ilitch").orElseGet(
                () -> repositorioLivro.newLivro("Ivan Ilitch")));
    }
}
