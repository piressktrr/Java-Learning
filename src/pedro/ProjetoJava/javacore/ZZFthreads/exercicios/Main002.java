package pedro.ProjetoJava.javacore.ZZFthreads.exercicios;

import pedro.ProjetoJava.javacore.ZZFthreads.dominios.Usuario;

import java.util.concurrent.CompletableFuture;

public class Main002 {
    public static void main(String[] args) {
        Usuario u = new Usuario("pedro", "controle ps4");
        dadosTelaInicial(u);
    }

    private static void dadosTelaInicial(Usuario usuario) {
        String nome = usuario.getNome();
        String c = usuario.getNomeCompra();
        String s = "Sugestões: lorem ipsum";

        CompletableFuture.supplyAsync(() -> "Dashboard: ")
                .thenApply(d -> d + " : " + nome + " : " +  c + " : " + s)
                .thenAccept(System.out::println);
    }
}
