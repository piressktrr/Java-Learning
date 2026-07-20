package pedro.ProjetoJava.javacore.ZZGconcorrencia.tests;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable {
    private int num;

    public Printer(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public void run() {
        System.out.println("Executing: " + Thread.currentThread().getName() + num);

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Executing: " + Thread.currentThread().getName() + num);
    }
}

public class ExecutorServiceTest01 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        executorService.execute(new Printer(1));
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));
        executorService.execute(new Printer(5));
        executorService.execute(new Printer(6));
        executorService1.execute(new Printer(6));
        executorService1.execute(new Printer(6));
        executorService1.execute(new Printer(6));
        executorService1.execute(new Printer(6));
        executorService.shutdown();
    }
}
