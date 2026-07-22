package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Pedido{
   private int id;
   private String descriçao;

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", descriçao='" + descriçao + '\'' +
                '}';
    }

    public Pedido(int id) {
        this.id = id;
    }

    public Pedido(int id, String descriçao) {
        this.id = id;
        this.descriçao = descriçao;
    }

}

class Produtor{
    public Pedido gerarPedido(int id, String descriçao){
        try {
            return new Pedido(id, descriçao);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}

class Consumidor {
    public void retirarPedido(ArrayBlockingQueue<Pedido> pedidos) throws InterruptedException {
        pedidos.take();
    }
}

public class Main006 {

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Pedido> pedidos = new ArrayBlockingQueue<>(10);
        Produtor produtor = new Produtor();
        Consumidor consumidor = new Consumidor();
        ExecutorService puts = Executors.newFixedThreadPool(5);
        ExecutorService consumers = Executors.newFixedThreadPool(5);
        puts.submit(() -> {
            try {
                pedidos.put(produtor.gerarPedido(1, "a"));
                pedidos.put(produtor.gerarPedido(2, "b"));
                pedidos.put(produtor.gerarPedido(3, "c"));
                pedidos.put(produtor.gerarPedido(4, "d"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                puts.shutdown();
            }

        });

        consumers.submit(() -> {
            try {
                consumidor.retirarPedido(pedidos);
                consumidor.retirarPedido(pedidos);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            } finally {
                consumers.shutdown();
            }
        });

        pedidos.forEach(System.out::println);

    }
}
