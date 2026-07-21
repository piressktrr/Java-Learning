package pedro.ProjetoJava.javacore.ZZGconcorrencia.tests;

import pedro.ProjetoJava.javacore.ZZGconcorrencia.dominios.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        StoreService storeService = new StoreService();
        searchPricesSync(storeService);

        System.out.println();
        System.out.println();
        System.out.println();

        searchPricesCompletableFutureSync(storeService);
    }

    private static void searchPricesSync(StoreService storeService) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println(storeService.getSync("Store 1"));
        System.out.println(storeService.getSync("Store 2"));
        System.out.println(storeService.getSync("Store 3"));
        System.out.println(storeService.getSync("Store 4"));
        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println("Total execution time: " + (end - start) + "ms");
    }

    private static void searchPricesCompletableFutureSync(StoreService storeService) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();

        CompletableFuture<Double> priceAsyncFuture1 = storeService.getSyncCompletableFuture("Store 1");
        CompletableFuture<Double> priceAsyncFuture2 = storeService.getSyncCompletableFuture("Store 2");
        CompletableFuture<Double> priceAsyncFuture3 = storeService.getSyncCompletableFuture("Store 3");
        CompletableFuture<Double> priceAsyncFuture4 = storeService.getSyncCompletableFuture("Store 4");

        System.out.println(priceAsyncFuture1.join());
        System.out.println(priceAsyncFuture2.join());
        System.out.println(priceAsyncFuture3.join());
        System.out.println(priceAsyncFuture4.join());

        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println("Total execution time: " + (end - start) + "ms");
    }
}
