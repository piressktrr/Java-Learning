package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main003 {
    public static void main(String[] args) throws InterruptedException {
        poolC();
    }

    private static void poolC() throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();
        for (int i = 0; i < 5; i++) {
            Runnable r = () -> {
                System.out.println(Thread.currentThread().getName());
                try {

                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " complete");
            };

            pool.submit(r);
        }

        pool.shutdown();
    }
}
