package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

class Counter{
    private int c = 0;
    private AtomicInteger a = new AtomicInteger(0);
    private int sync = 0;

    public void increment(){
        incrementRaceCondition();
        incrementSynchronized();
        incrementAtomicInteger();
    }

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

    public AtomicInteger getAtomic() {
        return a;
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

        Thread t = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t.start();
        t2.start();
        t3.start();
        t.join();
        t2.join();
        t3.join();


        System.out.println(counter.getRaceCondition());
        System.out.println(counter.getSync());
        System.out.println(counter.getAtomic());
    }
}
