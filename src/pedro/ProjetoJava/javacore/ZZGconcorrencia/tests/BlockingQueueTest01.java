package pedro.ProjetoJava.javacore.ZZGconcorrencia.tests;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1);
        queue.put("bruci");

        System.out.println(Thread.currentThread().getName() + ": " + queue.peek());
        System.out.println("Trying another value");
        new Thread(new RemoveFromQueue(queue)).start();
        queue.put("pires");
        System.out.println(Thread.currentThread().getName() + ": " + queue.peek());
    }

    static class RemoveFromQueue implements Runnable {
        private final BlockingQueue<String> queue;

        public RemoveFromQueue(BlockingQueue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("removendo da queue " + Thread.currentThread().getName() + ": " + queue.take());
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
