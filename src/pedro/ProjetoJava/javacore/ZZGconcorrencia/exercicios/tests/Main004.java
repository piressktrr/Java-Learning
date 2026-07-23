package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.dominios4.TokenBucket;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main004 {
    public static void main(String[] args) throws InterruptedException {
        TokenBucket tokenBucket = new TokenBucket();
        tokenBucket.iniciarReposicao();

        ExecutorService executor = Executors.newFixedThreadPool(5);

        // rajada inicial: 15 tentativas simultâneas, só 10 devem conseguir (capacidade inicial)
        for (int i = 0; i < 15; i++) {
            int id = i;
            executor.submit(() -> {
                boolean conseguiu = tokenBucket.tentarAdquirir();
                System.out.println("Thread " + id + ": " + (conseguiu ? "OK" : "NEGADO"));
            });
        }

        Thread.sleep(3000); // dá tempo da reposição rodar (3s ~ +6 tokens, respeitando o teto de 10)
        System.out.println("--- tokens disponíveis após espera: " + tokenBucket.getTotal());

        for (int i = 15; i < 20; i++) {
            int id = i;
            executor.submit(() -> {
                boolean conseguiu = tokenBucket.tentarAdquirir();
                System.out.println("Thread " + id + ": " + (conseguiu ? "OK" : "NEGADO"));
            });
        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
        tokenBucket.pararReposicao();
    }
}


