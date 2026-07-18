package pedro.ProjetoJava.javacore.ZZFthreads;

public class DeadLockTest01 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        Runnable r1 = () -> {
            synchronized (obj1) {
                System.out.println("Thread 1: segurando lock 1");
                System.out.println("Thread 1: segurando lock 2");
                synchronized (obj2) {
                    System.out.println("Thread 2: segurando lock 1");
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (obj2) {
                System.out.println("Thread 2: segurando lock 1");
                System.out.println("Thread 2: segurando lock 2");
                synchronized (obj1) {
                    System.out.println("Thread 1: segurando lock 2");
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
