package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

class Counter{
    private int c = 0;
    private AtomicInteger a = new AtomicInteger(0);
    private int sync = 0;



    public void incrementRaceCondition(){
        this.c++;
    }

    public synchronized void incrementSynchronized(){
        this.sync++;
    }

    public void incrementAtomicInteger(){
        this.a.incrementAndGet();
    }



    public int getRaceCondition() {
        return c;
    }

    public Integer getAtomic() {
        return a.intValue();
    }

    public int getSync() {
        return sync;
    }
}


public class Main001 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        Counter counter = new Counter();
        //tentei fazer com executor service mas nao consegui
        Runnable r = () -> {
            for(int i = 0; i < 1000; i++){
                counter.incrementRaceCondition();
                counter.incrementSynchronized();
                counter.incrementAtomicInteger();
            }
        };

       ExecutorService executor = Executors.newFixedThreadPool(6);
       executor.submit(r);
       executor.submit(r);
       executor.submit(r);
       executor.submit(r);
       executor.submit(r);
       executor.submit(r);

       executor.shutdown();

       boolean terminou =  executor.awaitTermination(10, TimeUnit.SECONDS);
       if (!terminou){
           executor.shutdownNow();
       }

        System.out.println(counter.getRaceCondition());
        System.out.println(counter.getSync());
        System.out.println(counter.getAtomic());
    }
}
