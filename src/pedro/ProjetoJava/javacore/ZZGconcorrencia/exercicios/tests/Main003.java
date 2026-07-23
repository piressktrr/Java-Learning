package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;


import pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.dominios3.Conexao;
import pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.dominios3.PoolDeConexoes;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main003 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        PoolDeConexoes pool = new PoolDeConexoes(3); // pool com 3 conexões
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            int id = i;
            executor.submit(() -> {
                try {
                    System.out.println("Thread " + id + " pedindo conexão...");
                    Conexao c = pool.obterConexao();
                    System.out.println("Thread " + id + " obteve " + c);
                    Thread.sleep(1000); // simula uso
                    pool.devolverConexao(c);
                    System.out.println("Thread " + id + " devolveu " + c);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(15, TimeUnit.SECONDS);
    }
}
