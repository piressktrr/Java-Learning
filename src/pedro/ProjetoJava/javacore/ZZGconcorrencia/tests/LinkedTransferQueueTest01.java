package pedro.ProjetoJava.javacore.ZZGconcorrencia.tests;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> queue = new LinkedTransferQueue<>();
        queue.add("bruci");

        queue.offer("pedro");
        System.out.println(queue.offer("pedro", 5, TimeUnit.SECONDS));
        queue.put("pires");
        if (queue.hasWaitingConsumer()) {
            System.out.println(queue.poll());
            queue.transfer("souza");
        }
        queue.tryTransfer("Henrique");
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.poll());

        queue.forEach(System.out::println);

    }
}
