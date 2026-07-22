package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.dominios3;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PoolDeConexoes {
    private  List<Conexao> conexoes = List.of(new Conexao(1), new Conexao(2), new Conexao(3));
    private final ReentrantLock reentrantLock = new ReentrantLock();
    Condition condition = reentrantLock.newCondition();

    public Conexao obterConexao()  {
        if ( conexoes.isEmpty() ) {
            try {
                condition.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName()  + ": Retornando uma nova conexão!");
        return new Conexao(ThreadLocalRandom.current().nextInt(1, 100));
    }

    public void devolverConexao(Conexao c) {
        condition.signalAll();
        conexoes.add(c);
        System.out.println(Thread.currentThread().getName()  + ": Devolvendo uma conexão!");

    }
}
