package pedro.ProjetoJava.javacore.ZZGconcorrencia.tests;

import pedro.ProjetoJava.javacore.ZZGconcorrencia.dominios.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricesCompletableFutureAsync(storeService);
    }

    private static void searchPricesCompletableFutureAsync(StoreService storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store1", "Store2", "Store3", "Store4", "Store5");

         List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(storeService::getSyncCompletableFuture)
                .toList();

         List<Double> val = completableFutures.stream()
                .map(CompletableFuture::join)
                .toList();

        long end = System.currentTimeMillis();
        System.out.println("RANDOM PRICES GENERATED: ");
        System.out.println(val);
        System.out.println();
        System.out.println("Total time taken: " + (end - start) + "ms");

    }
}
