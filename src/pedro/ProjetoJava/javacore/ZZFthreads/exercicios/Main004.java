package pedro.ProjetoJava.javacore.ZZFthreads.exercicios;

public class Main004 {
    public static void main(String[] args) {
        Runnable tarefaA = () -> System.out.println(Math.pow(1, 2));
        Runnable tarefaB = () -> System.out.println(Math.pow(2, 2));
        Runnable tarefaC = () -> System.out.println(Math.pow(3, 2));
        Runnable tarefaD = () -> System.out.println(Math.pow(4, 2));

        Thread t1 = new Thread(tarefaA);
        Thread t2 = new Thread(tarefaB);
        Thread t3 = new Thread(tarefaC);
        Thread t4 = new Thread(tarefaD);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.run();

    }
}
