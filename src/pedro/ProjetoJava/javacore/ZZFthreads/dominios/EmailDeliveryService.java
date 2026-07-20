package pedro.ProjetoJava.javacore.ZZFthreads.dominios;

public class EmailDeliveryService implements Runnable{
    private final Members  members;
    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName =  Thread.currentThread().getName();
        System.out.println(threadName + " starting to deliver emails");
        while(members.isOpen() || members.pendingEmails() > 0){
            try {
                String email = members.retrieveEmail();
                if(email == null) continue;
                System.out.println(threadName + " sending email: " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " email sucessfull sending to " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("All emails are delivered with sucess" );
    }
}
