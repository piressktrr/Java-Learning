package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;


import pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.dominios3.Conexao;
import pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.dominios3.PoolDeConexoes;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main003 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        PoolDeConexoes pool = new PoolDeConexoes();
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.submit(() -> {
            for (int i = 0; i < 10; i++) {
                pool.obterConexao();
            }
        });

        executor.submit(() -> {
            pool.devolverConexao(new Conexao(7));
        });


        executor.shutdown();
    }



}
