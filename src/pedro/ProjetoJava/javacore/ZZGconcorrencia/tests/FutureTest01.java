package pedro.ProjetoJava.javacore.ZZGconcorrencia.tests;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Double> future = executor.submit(() -> {
            TimeUnit.SECONDS.sleep(3);
            return 5.05D;
        });

        System.out.println(doSomething());

        Double dollarImp = future.get(3, TimeUnit.SECONDS);
        System.out.println(dollarImp);
        executor.shutdown();

    }

    private static long  doSomething(){
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }
}
