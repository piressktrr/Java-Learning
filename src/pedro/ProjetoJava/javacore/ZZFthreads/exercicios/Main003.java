package pedro.ProjetoJava.javacore.ZZFthreads.exercicios;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main003 {

    public static void main(String[] args) {

        teste(); // nao entendi ate agora o executor

    }

    public static void teste(){
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            System.out.println("Executando");
        });

        Future<String> future1 = executor.submit(() -> {
            System.out.println("Executando");
            return "tarefa 1";
        });

        Future<String> future2 = executor.submit(() -> {
            System.out.println("Executando");
            return "tarefa 2";
        });

        Future<String> future3 = executor.submit(() -> {
            System.out.println("Executando");
            return "tarefa 3";
        });


        try {
            String r = future1.get();
            String r2 = future2.get();
            String r3 = future3.get();

            System.out.println("Resultado: " + r);
            System.out.println("Resultado: " + r2);
            System.out.println("Resultado: " + r3);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        } finally {
            executor.shutdown();
        }
    }
}
