package pedro.ProjetoJava.exerciciosRevisaoInternetP3;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios.biblioteca01;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios.livro01;

public class exerciciosP301 {
    public static void main(String[] args) {
        livro01 livro01 = new livro01("metamorfose", "kafka", 100, false);
        livro01 livro02 = new livro01("a morte de ivan ilitch", "tolstoi", 100, true);
        livro01 livro03 = new livro01("vidas secas", "graciano");
        livro01 livro04 = new livro01("noites brancas", "dostoiesvki");

        biblioteca01 biblioteca = new biblioteca01();
        biblioteca.adicionarLivro(livro01, 0);
        biblioteca.adicionarLivro(livro02, 1);
        biblioteca.adicionarLivro(livro03, 2);
        biblioteca.adicionarLivro(livro04, 3);

        System.out.println();
        biblioteca.listarLivrosDisponiveis();
        System.out.println();
        biblioteca.contarLivrosDisponiveis();
        System.out.println("Total de livros cadastrados disponiveis: " +biblioteca.getContarLivros());
    }
}
