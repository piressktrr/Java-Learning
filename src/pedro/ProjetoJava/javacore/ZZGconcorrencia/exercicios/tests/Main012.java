package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Main012 {
    public static void main(String[] args) {
        System.out.println("=== TESTE 1: Tratando Falha (Crash) ===");


        CompletableFuture<Object> chamadaComErro = CompletableFuture.supplyAsync(() -> {
            System.out.println("[API] Buscando dados de recomendação...");
            throw new RuntimeException("API de Recomendações caiu!"); // Simulando erro
        }).exceptionally(excecao -> {
            // Se a thread original explodir, ela cai aqui dentro.
            System.err.println("[FALLBACK] Erro detectado: " + excecao.getMessage());
            return "Recomendação Padrão (Mais Vendidos)";
        });

        System.out.println("Resultado 1: " + chamadaComErro.join());

        System.out.println("\n=== TESTE 2: Tratando Lentidão (Timeout) ===");
        CompletableFuture<String> chamadaDemorada = CompletableFuture.supplyAsync(() -> {
            System.out.println("[API] Calculando rota de entrega complexa...");
            try { Thread.sleep(5000); } catch (InterruptedException e) {} // Simula 5s de demora
            return "Rota calculada pelo sistema central";
        }).completeOnTimeout("Rota Padrão (Correios)", 2, TimeUnit.SECONDS);
        // ^ Se não responder em 2 segundos, injeta o valor padrão e segue a vida.

        System.out.println("Resultado 2: " + chamadaDemorada.join());
    }
}
