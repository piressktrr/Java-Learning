package pedro.ProjetoJava.javacore.ZZGconcorrencia.tests;

import pedro.ProjetoJava.javacore.ZZGconcorrencia.dominios.Quote;
import pedro.ProjetoJava.javacore.ZZGconcorrencia.dominios.StoreServiceWDescount;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWDescount storeServiceWDescount = new StoreServiceWDescount();
        SearchPricesWithDescount(storeServiceWDescount);

    }

    private static void SearchPricesWithDescount(StoreServiceWDescount storeServiceWDescount) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1",  "Store 2", "Store 3", "Store 4");

         List<CompletableFuture<String>> list = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeServiceWDescount.getSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(q -> CompletableFuture.supplyAsync(() -> storeServiceWDescount.applyDiscount(q))))
                .toList();

        list.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);

        long end = System.currentTimeMillis();

    }
}
