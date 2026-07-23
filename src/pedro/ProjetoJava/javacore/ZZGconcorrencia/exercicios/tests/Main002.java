package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Catalogo {
    private final Map<String, Integer> catalogo = new LinkedHashMap<>();
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void put(String key, Integer valor) {
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + ": escrevendo " + key);
            catalogo.put(key, valor);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // boa prática: restaura o status de interrupção
            throw new RuntimeException(e);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public Set<String> get() {
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + ": lendo");
            return new LinkedHashSet<>(catalogo.keySet()); // cópia defensiva
        } finally {
            lock.readLock().unlock();
        }
    }
}

public class Main002 {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Runnable w = () -> {
            catalogo.put("Produto A", 1);
            catalogo.put("Produto B", 2);
            catalogo.put("Produto C", 3);
        };

        Runnable r = () -> System.out.println(Thread.currentThread().getName() + " leu: " + catalogo.get());

        Thread write = new Thread(w, "writer");
        Thread reader1 = new Thread(r, "reader-1");
        Thread reader2 = new Thread(r, "reader-2");

        write.start();
        reader1.start();
        reader2.start();
    }

}
