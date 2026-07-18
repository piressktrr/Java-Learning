package pedro.ProjetoJava.javacore.ZZGconcorrencia.tests;

class Counter{
    private int count;

    public void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class AtomicIntegerTest01 {

    public static void main(String[] args) {
        Counter c = new Counter();

        Runnable r = () -> {
            for (int i = 0; i < 100; i++) {
                c.increment();
            }
        };

        new Thread(r).start();
    }
}
