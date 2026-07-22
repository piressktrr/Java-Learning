package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Tarefa implements Runnable {
    public String email;

    public Tarefa(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void run() {
        System.out.println("Emails executando" + Thread.currentThread().getName() + " : " + getEmail());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Email executado" + Thread.currentThread().getName());

    }
}

public class Main007 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(new Tarefa("exemplo1@gmail.com"));
        executorService.execute(new Tarefa("exemplo2@gmail.com"));
        executorService.execute(new Tarefa("exemplo3@gmail.com"));
        executorService.execute(new Tarefa("exemplo4@gmail.com"));

        boolean b = executorService.awaitTermination(5, TimeUnit.SECONDS);

        if (b){
            executorService.shutdown();
        } else {
            executorService.shutdownNow();
        }
    }
}
