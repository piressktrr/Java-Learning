package pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios;

public class livro01 {
    private String titulo;
    private String autor;
    private int numPaginas;
    private boolean disponivel;

    public livro01(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = 0;
        this.disponivel = true;
    }

    public livro01(String titulo, String autor, int numPaginas, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()){
            System.out.println("Titulo inválido, repita novamente.");
            return;
            }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.isBlank()){
            System.out.println("Autor inválido, repita novamente.");
            return;
        }
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        if (numPaginas < 0){
            this.numPaginas = 0;
            System.out.println("Número de paginas inválido, repita novamente");
            return;
        }
        this.numPaginas = numPaginas;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
