package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.dominios4;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TokenBucket {

    private static final int CAPACIDADE_MAXIMA = 10;
    private static final int TOKENS_POR_REPOSICAO = 2;

    private final AtomicInteger total;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public TokenBucket() {
        this.total = new AtomicInteger(CAPACIDADE_MAXIMA); // começa cheio
    }

    public void iniciarReposicao() {
        scheduler.scheduleWithFixedDelay(() ->
                        total.updateAndGet(atual -> Math.min(CAPACIDADE_MAXIMA, atual + TOKENS_POR_REPOSICAO)),
                1, 1, TimeUnit.SECONDS
        );
    }

    public void pararReposicao() {
        scheduler.shutdown();
    }

    public boolean tentarAdquirir() {
        int atual;
        do {
            atual = total.get();
            if (atual <= 0) {
                return false;
            }
        } while (!total.compareAndSet(atual, atual - 1));
        return true;
    }

    public int getTotal() {
        return total.get();
    }
}
