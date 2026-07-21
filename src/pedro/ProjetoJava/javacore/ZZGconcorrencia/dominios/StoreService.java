package pedro.ProjetoJava.javacore.ZZGconcorrencia.dominios;

import java.util.concurrent.*;

public class StoreService {
    private static final ExecutorService executor = Executors.newCachedThreadPool();

    public   double getSync(String n){
        System.out.println("Getting sync for store: " + n);
        return priceGenerator();
    }

    public CompletableFuture<Double> getSyncCompletableFuture(String n){
        System.out.println("Getting sync for store: " + n);
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }


    private double priceGenerator() {
        System.out.println("Generating price: " + Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextDouble(1,500);
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
