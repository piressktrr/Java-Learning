package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main008 {
    public static void main(String[] args) {
        gerarRelatorio();
    }

    public static void gerarRelatorio() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);

        Runnable task = () -> {
            System.out.println("Gerando relatorio.." + Thread.currentThread().getName());
        };

         ScheduledFuture<?> scheduledFuture = executorService.scheduleWithFixedDelay(task, 0, 2, TimeUnit.SECONDS);
//         ScheduledFuture<?> scheduledFuture1 = executorService.scheduleAtFixedRate(task, 0, 3, TimeUnit.SECONDS);
         executorService.schedule(() -> {
             scheduledFuture.cancel(false);

         }, 10, TimeUnit.SECONDS);

    }


}
