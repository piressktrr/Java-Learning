package pedro.ProjetoJava.exerciciosRevisaoInternet;

import pedro.ProjetoJava.exerciciosRevisaoInternet.dominios.livro026;

public class exercicio026Internet {
    public static void main(String[] args) {
        livro026 livro = new livro026("morte de ivan lilitch");
        livro026 livro2 = new livro026("tolstoi", 1940, 10);

        System.out.println(livro.getTitulo());
        System.out.println(livro2.getAno());
        System.out.println(livro2.getAutor());
        System.out.println(livro2.getQuantidade());
        System.out.println(livro026.getQuantidadeDeLivros());

    }
}
