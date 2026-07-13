package pedro.ProjetoJava.javacore.ZZDoptional.dominios1;

import java.time.LocalDateTime;

public class Livro {
    private String autor;
    private String titulo;
    private LocalDateTime ano;
    private boolean disponivel;


    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }


    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public Livro(String autor, String titulo, LocalDateTime ano, boolean disponivel) {
        this.autor = autor;
        this.titulo = titulo;
        this.ano = ano;
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
