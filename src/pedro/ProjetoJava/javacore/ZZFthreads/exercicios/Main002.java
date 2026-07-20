package pedro.ProjetoJava.javacore.ZZFthreads.exercicios;

import pedro.ProjetoJava.javacore.ZZFthreads.dominios.Usuario;

import java.util.concurrent.CompletableFuture;

public class Main002 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        CompletableFuture<String> usuario = CompletableFuture.supplyAsync(Main002::buscarDadosUsuario);
        CompletableFuture<String> compras = CompletableFuture.supplyAsync(Main002::buscarUltimasCompras);
        CompletableFuture<String> sugestoes = CompletableFuture.supplyAsync(Main002::buscarSugestoes); // aqui
        // o tempo total sera somente da chamada mais lenta

        CompletableFuture.allOf(usuario, compras, sugestoes).join();

        dadosTelaInicial(usuario.join(),  compras.join(), sugestoes.join(), System.currentTimeMillis() - inicio);
    }

    private static void dadosTelaInicial(String u, String c, String s, long tTotal) {
        System.out.println("Dados montados: " + u + ", " + c + ", " + s);
        System.out.println("Tempo total de resposta: " + tTotal + "ms");
    }

    private static String buscarDadosUsuario() {
        simularLentidao(2000); // 2 segundos
        return "Usuário João";
    }

    private static String buscarUltimasCompras() {
        simularLentidao(3000); // 3 segundos (A MAIS LENTA)
        return "TV 50 polegadas";
    }

    private static String buscarSugestoes() {
        simularLentidao(1000); // 1 segundo
        return "Soundbar";
    }

    private static void simularLentidao(int ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { }
    }
}
