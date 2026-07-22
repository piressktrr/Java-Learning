package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Catalogo {
    private Map<String, Integer>catalogo = new LinkedHashMap<>();
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public Catalogo(ReentrantReadWriteLock lock) {
        this.lock = lock;
    }

    public Map<String, Integer> getCatalogo() {
        return catalogo;
    }

    public void put (String key, Integer valor) {
        lock.writeLock().lock();
        try {
            if (lock.isWriteLocked()) {
                System.out.println(Thread.currentThread().getName() + ": put");
            }

            catalogo.put(key, valor);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.writeLock().unlock();
        }

    }

    public Set<String> get () {
        lock.readLock().lock();
        try {
            return catalogo.keySet();
        } catch ( Exception e ) {
            throw new RuntimeException(e);
        } finally {
            lock.readLock().unlock();
        }
    }
}

public class Main002 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        Catalogo catalogo = new Catalogo(lock);
        Runnable w = () -> {

            catalogo.put ("Produto A", 1);
            catalogo.put ("Produto B", 2);
            catalogo.put ("Produto C", 3);
        };

        Runnable r = () -> {
            if (lock.isWriteLocked()) {
                System.out.println("write locked");
            }
            System.out.println("reader w/ write lock");
            try {
                System.out.println(catalogo.get());
            }catch (Exception e) {
                e.printStackTrace();
            }
        };

        Thread write = new Thread(w);
        Thread reader = new Thread(r);

        write.start();
        reader.start();


    }

}
