package pedro.ProjetoJava.javacore.ZZFthreads;

class ThreadRunnable implements Runnable {
    private char c;

    public ThreadRunnable(char c) {
        this.c = c;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.print(c);

            if (i % 50 == 0) {
                System.out.println();
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        Thread.yield();
    }

}

public class ThreadsTest02 {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadRunnable('A'));
        Thread t2 = new Thread(new ThreadRunnable('B'));
        t1.start();
        t1.join();
        t2.start();

    }
}
