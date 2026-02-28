package pedro.ProjetoJava.exerciciosRevisaoInternet.dominios;

public class livro026 {
    public String titulo;
    public String autor;
    public int ano;
    public int quantidade;
    public static int quantidadeDeLivros;

    public livro026(String titulo) {
        this.titulo = titulo;
        quantidadeDeLivros++;
    }

    public livro026(String autor, int ano, int quantidade) {

        this.autor = autor;
        this.ano = ano;
        this.quantidade = quantidade;
        quantidadeDeLivros++;

    }

    public static int getQuantidadeDeLivros() {
        return quantidadeDeLivros;
    }

    public int emprestar(int valor){
        return quantidade -= valor;
    }
    public int devolver(int valor){
        return quantidade += valor;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
