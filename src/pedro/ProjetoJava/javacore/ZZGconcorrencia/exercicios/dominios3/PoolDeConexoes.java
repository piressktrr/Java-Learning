package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.dominios3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PoolDeConexoes {
    private final List<Conexao> conexoes;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public PoolDeConexoes(int tamanho) {
        List<Conexao> lista = new ArrayList<>();
        for (int i = 1; i <= tamanho; i++) {
            lista.add(new Conexao(i));
        }
        this.conexoes = lista;
    }

    public Conexao obterConexao() {
        lock.lock(); // <- precisa segurar o lock ANTES de mexer em condition ou na lista
        try {
            while (conexoes.isEmpty()) {
                System.out.println(Thread.currentThread().getName() + ": pool vazio, aguardando...");
                condition.await(); // libera o lock enquanto espera, e retoma o lock ao acordar
            }
            Conexao c = conexoes.remove(conexoes.size() - 1); // pega de verdade uma conexão existente
            System.out.println(Thread.currentThread().getName() + ": obteve conexão " + c.getId());
            return c;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void devolverConexao(Conexao c) {
        lock.lock();
        try {
            conexoes.add(c);
            System.out.println(Thread.currentThread().getName() + ": devolveu conexão " + c.getId());
            condition.signalAll(); // acorda threads esperando, mas elas só seguem quando conseguirem o lock de volta
        } finally {
            lock.unlock();
        }
    }
}
