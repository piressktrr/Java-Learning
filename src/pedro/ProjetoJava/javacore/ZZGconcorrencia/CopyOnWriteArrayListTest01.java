package pedro.ProjetoJava.javacore.ZZGconcorrencia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class CopyOnWriteArrayListTest01 {
    public static void main(String[] args) {
        List<Integer> lista = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 1000; i++) {
            lista.add(i);
        }

        Runnable i = () -> {
            Iterator<Integer> iterator = lista.iterator();
            try{
                TimeUnit.SECONDS.sleep(2);
                iterator.forEachRemaining(System.out::println);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        };

        Runnable j = () -> {
            for (int b = 0; b < 500; b++) {
                System.out.println(Thread.currentThread().getName() + b);
            }
        };

        new Thread(i).start();
        new Thread(j).start();


    }
}
