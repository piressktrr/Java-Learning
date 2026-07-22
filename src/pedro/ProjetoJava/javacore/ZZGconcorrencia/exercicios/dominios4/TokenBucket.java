package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.dominios4;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TokenBucket {
    private AtomicInteger total = new AtomicInteger(0);
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

    public void repo () {
        executor.scheduleWithFixedDelay(() -> {
            total.addAndGet(2);
            if (total.compareAndSet(10, 10)) {
                executor.shutdown();
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

    public boolean tentaAdquirir() {
       if (total.get() > 0) {
           total.decrementAndGet();
           return true;
       } else {
           total.compareAndSet(-1, 0);
           return false;
       }

    }




}
