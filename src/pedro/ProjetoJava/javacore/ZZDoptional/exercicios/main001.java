package pedro.ProjetoJava.javacore.ZZDoptional.exercicios;

import pedro.ProjetoJava.javacore.ZZDoptional.dominios1.Livro;
import pedro.ProjetoJava.javacore.ZZDoptional.dominios1.RepositorioLivro;


public class main001 {
    public static void main(String[] args) {
        RepositorioLivro repositorioLivro = new RepositorioLivro();
        Livro livro = new Livro("Dostoievski", "Memorias do subsolo");

        repositorioLivro.findByAutor("Dostoievski").ifPresentOrElse(
                l -> System.out.println("Titulo encontrado: " +l.getTitulo())
                , () -> System.out.println("NÃO TEM TITULO"));


        repositorioLivro.findByTitle("Habitos Atomicos").orElseThrow(
                () -> new IllegalArgumentException("Não existe esse titulo"));

        repositorioLivro.findByAutor("Ivan Ilitch").orElseGet(
                () -> new Livro("Ivan Ilitch", "TITUTLO DESCONHECIDO"));
    }
}
