package pedro.ProjetoJava.javacore.ZZGconcorrencia.tests;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable{
    private String nome;
    private ReentrantLock reentrantLock;
    private Condition condition = reentrantLock.newCondition();

    public Worker(String nome, ReentrantLock reentrantLock) {
        this.nome = nome;
        this.reentrantLock = reentrantLock;
    }

    @Override
    public void run() {
        reentrantLock.lock();
        try{
            if (reentrantLock.isHeldByCurrentThread()){
                System.out.println("Thread "+nome+" is held by current thread");
            }
            System.out.println("Threads esperando na fila: " + reentrantLock.getQueueLength());
            System.out.println("A thread " +nome+ " vai esperar 2 segundos");
            Thread.sleep(2000);
            System.out.printf("A thread %s finalizou a sessão", nome);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally   {
            reentrantLock.unlock();
        }
    }
}

public class ReentrantLockTest01 {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        new Thread(new Worker("A", reentrantLock)).start();
        new Thread(new Worker("B", reentrantLock)).start();
        new Thread(new Worker("C", reentrantLock)).start();
        new Thread(new Worker("D", reentrantLock)).start();
        new Thread(new Worker("E", reentrantLock)).start();
        new Thread(new Worker("F", reentrantLock)).start();
        new Thread(new Worker("G", reentrantLock)).start();
    }
}
