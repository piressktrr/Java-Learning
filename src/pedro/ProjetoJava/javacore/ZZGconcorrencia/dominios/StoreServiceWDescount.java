package pedro.ProjetoJava.javacore.ZZGconcorrencia.dominios;

import java.util.concurrent.*;

public class StoreServiceWDescount {
    private static final ExecutorService executor = Executors.newCachedThreadPool();

    public  String getSync(String n){
        System.out.println("Getting sync for store: " + n);
        double  p = priceGenerator();
        Discount.Code code = Discount.Code.values()[ThreadLocalRandom.current().nextInt(Discount.Code.values().length)];
        return String.format("%s:%s.2f:%s",  n, p, code);
    }

    public String applyDiscount(Quote quote) {
        delay();
        double discountValue = quote.getPrice() * (100 - quote.getDiscount().getValue()) / 100;
        return String.format("'%s' original price: '%.2f'. Applying discount code '%s'. Final price: '%.2f'",
                quote.getNome(),
                quote.getPrice(),
                quote.getDiscount(),
                discountValue);
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
