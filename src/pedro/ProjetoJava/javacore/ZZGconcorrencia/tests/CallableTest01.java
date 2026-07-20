package pedro.ProjetoJava.javacore.ZZGconcorrencia.tests;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String> {
    private int valor;

    @Override
    public String call() throws Exception {
        valor = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i <= valor; i++) {
            System.out.println("Executando callable: " + Thread.currentThread().getName());
        }
        return String.format("Finalizado e o número aleatório é: " + Thread.currentThread().getName() + valor);
    }
}

public class CallableTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberCallable callable = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> submit = executorService.submit(callable);
        String r = submit.get();
        System.out.println(r + Thread.currentThread().getName());
        executorService.shutdown();

    }
}
