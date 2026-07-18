package pedro.ProjetoJava.javacore.ZZFthreads;

public class ThreadsTest01 {
    static class ThreadExample extends Thread{
        private final char c;

        public ThreadExample(char c) {
            this.c = c;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                System.out.print(c);

                if (i % 50 == 0) {
                    System.out.println();
                }

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }

        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExample('A'));
        Thread t2 = new Thread(new ThreadExample('B'));

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
    }
}
