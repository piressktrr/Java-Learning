package pedro.ProjetoJava.javacore.ZZFthreads;

public class ThreadsTest03 implements Runnable {
    private Account account;

    public static void main(String[] args) {
        ThreadsTest03 threadsTest03 = new ThreadsTest03();
        Thread t1 = new Thread(threadsTest03);
        Thread t2 = new Thread(threadsTest03);
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if (account.getBalance() < 0) {
                System.out.println("fudeu");
            }
        }
    }

    private void saque(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " está indo sacar dinheiro");
            account.saque(amount);
            System.out.println(Thread.currentThread().getName() + " saque realizado com sucesso");
        } else {
            System.out.println("sem dinheiro para " + Thread.currentThread().getName() + " conseguir sacar");
        }
    }
}
