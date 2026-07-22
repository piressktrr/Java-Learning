package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.dominios4.TokenBucket;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main004 {
    public static void main(String[] args) {
        TokenBucket  tokenBucket = new TokenBucket();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.execute(() -> {
            System.out.println(tokenBucket.tentaAdquirir());
        });

        executor.shutdown();

    }


}


