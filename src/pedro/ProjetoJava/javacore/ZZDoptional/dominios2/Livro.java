package pedro.ProjetoJava.javacore.ZZDoptional.dominios2;

public class Livro {
    private String autor;
    private String titulo;

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

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
