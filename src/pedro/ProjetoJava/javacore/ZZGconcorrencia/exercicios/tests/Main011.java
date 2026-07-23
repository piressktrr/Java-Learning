package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import java.util.concurrent.CompletableFuture;

public class Main011 {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO allOf (Esperar Todas) ===");
        testarAllOf();

        System.out.println("\n=== TESTANDO anyOf (O Primeiro que Chegar) ===");
        testarAnyOf();
    }

    private static void testarAllOf() {
        // Disparamos 3 chamadas independentes ao mesmo tempo
        CompletableFuture<String> estoque = CompletableFuture.supplyAsync(() -> simularApi("Estoque: 5 unidades", 1000));
        CompletableFuture<String> preco = CompletableFuture.supplyAsync(() -> simularApi("Preço: R$ 199,90", 2000));
        CompletableFuture<String> frete = CompletableFuture.supplyAsync(() -> simularApi("Frete: R$ 20,00", 1500));

        // allOf cria um "super futuro" que só completa quando os 3 terminarem.
        // Ele retorna Void, pois não sabe como você quer juntar os dados.
        CompletableFuture<Void> todasAsChamadas = CompletableFuture.allOf(estoque, preco, frete);

        System.out.println("Aguardando todas as APIs responderem...");
        todasAsChamadas.join(); // Trava a thread principal até as 3 finalizarem

        // Como sabemos que já terminaram, dar o .join() nelas agora é instantâneo
        System.out.println("Página montada com sucesso!");
        System.out.println("- " + estoque.join());
        System.out.println("- " + preco.join());
        System.out.println("- " + frete.join());
    }

    private static void testarAnyOf() {
        // Disparamos 3 servidores de CEP que fazem a mesma coisa, mas com tempos diferentes
        CompletableFuture<String> server1 = CompletableFuture.supplyAsync(() -> simularApi("Servidor 1 (Lento)", 3000));
        CompletableFuture<String> server2 = CompletableFuture.supplyAsync(() -> simularApi("Servidor 2 (Rápido)", 500));
        CompletableFuture<String> server3 = CompletableFuture.supplyAsync(() -> simularApi("Servidor 3 (Médio)", 1500));

        // anyOf retorna o resultado da primeira que terminar (e ignora as outras)
        CompletableFuture<Object> corrida = CompletableFuture.anyOf(server1, server2, server3);

        System.out.println("Aguardando o servidor mais rápido...");
        System.out.println("Vencedor: " + corrida.join());
    }

    // Método utilitário para simular a demora de uma API
    private static String simularApi(String resposta, int tempoMs) {
        try { Thread.sleep(tempoMs); } catch (InterruptedException e) {}
        return resposta;
    }
}
