package pedro.ProjetoJava.javacore.ZZGconcorrencia.tests;

import java.util.concurrent.atomic.AtomicInteger;

class Counter{
    private int count;
    private AtomicInteger counter = new AtomicInteger(0);
    public void increment(){
        count++;
        counter.incrementAndGet(); // garante que sempre o resultado vai ser 20.000
    }

    public int getCount() {
        return count;

    }

    public AtomicInteger getCounter() {
        return counter;
    }
}

public class AtomicIntegerTest01 {

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable r = () -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(c.getCount());
        System.out.println(c.getCounter());

    }
}
