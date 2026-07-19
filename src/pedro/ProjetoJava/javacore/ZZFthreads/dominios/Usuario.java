package pedro.ProjetoJava.javacore.ZZFthreads.dominios;

public class Usuario {
    private String nome;
    private String nomeCompra;

    public Usuario(String nome, String nomeCompra) {
        this.nome = nome;
        this.nomeCompra = nomeCompra;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCompra() {
        return nomeCompra;
    }
}
