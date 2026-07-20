package pedro.ProjetoJava.javacore.ZZFthreads.dominios;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<String>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email) {
        synchronized (emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println("["+threadName+"] Adding email: " + email);
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() {
        System.out.println("["+Thread.currentThread().getName()+"] Retrieving email: " + this.emails);
        synchronized (emails) {
            while (this.emails.isEmpty()) {
                if (!open) break;
                System.out.println(Thread.currentThread().getName()+": Not have a email in the list ...");
                try {
                    this.emails.wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            return this.emails.poll();
        }
    }

    public void close() {
        open = false;
        synchronized (this.emails) {
            System.out.println("[" + Thread.currentThread().getName() + "] notify all that we not getting more emails");
        }
    }
}
