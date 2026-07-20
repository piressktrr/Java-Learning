package pedro.ProjetoJava.javacore.ZZGconcorrencia.tests;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class mapReadWrite{
    private final Map<String, String> map = new LinkedHashMap<>();
    private final ReentrantReadWriteLock reentrantReadWriteLock;

    public mapReadWrite(ReentrantReadWriteLock reentrantReadWriteLock) {
        this.reentrantReadWriteLock = reentrantReadWriteLock;
    }

    public void put(String key, String value){
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (reentrantReadWriteLock.isWriteLocked()){
                System.out.println(Thread.currentThread().getName()+" obtain write lock");
            }
            map.put(key, value);
            Thread.sleep(500);
        }catch (Exception e){
            System.out.println(e.getMessage());
        } finally{
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public Set<String> getKeys(){
        reentrantReadWriteLock.readLock().lock();
        try {
            return map.keySet();
        }catch (Exception e){
            System.out.println(e.getMessage());
        } finally{
            reentrantReadWriteLock.readLock().unlock();
        }
        return null;
    }
}



public class ReentrantLockReadWriteTest01 {
    public static void main(String[] args) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        mapReadWrite map = new mapReadWrite(reentrantReadWriteLock);

        Runnable writer = () -> {
            for (int i = 0; i < 15; i++) {
                map.put(String.valueOf(i), String.valueOf(i));
            }
        };

        Runnable reader = () -> {
            if (reentrantReadWriteLock.isWriteLocked()) {
                System.out.println("write locked");
            }

            System.out.println("i gotta write lock!");
            try {
                System.out.println(Thread.currentThread().getName()+" " + map.getKeys());
            } finally {

            }
        };

        Thread thread1 = new Thread(writer);
        Thread thread2 = new Thread(reader);
        Thread thread4 = new Thread(reader);

        thread1.start();
        thread2.start();
        thread4.start();
    }
}
