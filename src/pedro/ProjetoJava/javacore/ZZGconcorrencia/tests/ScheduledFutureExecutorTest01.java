package pedro.ProjetoJava.javacore.ZZGconcorrencia.tests;

import pedro.ProjetoJava.javacore.Gassociacao.dominio.Time;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledFutureExecutorTest01 {

    private static final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

    private static void beeper() {
        Runnable beeper = () -> {
            System.out.println("beeper");
        };

        ScheduledFuture<?> scheduleWithFixedDelay = executorService.scheduleWithFixedDelay(beeper, 1, 3, TimeUnit.SECONDS);
        executorService.schedule(() -> {
            scheduleWithFixedDelay.cancel(false);
        }, 10, TimeUnit.SECONDS);
        executorService.shutdown();
    }
    public static void main(String[] args) {
        beeper();
    }
}
