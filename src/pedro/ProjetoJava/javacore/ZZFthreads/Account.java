package pedro.ProjetoJava.javacore.ZZFthreads;

public class Account {
    private int balance = 50;

    public void saque(int amount) {
        this.balance = balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}
