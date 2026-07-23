package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Pedido{
   private int id;
   private String descriçao;
   private int preco;

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", descriçao='" + descriçao + '\'' +
                '}';
    }

    public String getDescriçao() {
        return descriçao;
    }

    public Pedido(int id, String descriçao) {
        this.id = id;
        this.descriçao = descriçao;
    }

    public int getId() {
        return id;
    }
}

class Produtor implements Runnable{
    private final BlockingQueue<Pedido> fila;

    public Produtor(BlockingQueue<Pedido> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Pedido pedido = new Pedido(i, "Produto " + i);
                fila.put(pedido); // Bloqueia se a fila estiver cheia
                System.out.println("📦 Produzido: " + pedido);
                Thread.sleep(500); // Simula tempo de fabricação
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restaura o status de interrupção
        }
    }
}

class Consumidor implements Runnable{
    private final BlockingQueue<Pedido> fila;

    public Consumidor(BlockingQueue<Pedido> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        try {
            // O consumidor roda continuamente (ou até uma condição de parada)
            for (int i = 1; i <= 5; i++) {
                Pedido pedido = fila.take(); // Bloqueia se a fila estiver vazia
                System.out.println("🛒 Consumido: " + pedido);
                Thread.sleep(1000); // Simula lentidão no processamento
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Main006 {

    public static void main(String[] args) throws InterruptedException {
        // Fila com limite pequeno para forçar o produtor a esperar se for rápido demais
        BlockingQueue<Pedido> filaPedidos = new ArrayBlockingQueue<>(2);

        // Podemos usar um único pool para gerenciar produtores e consumidores
        ExecutorService executor = Executors.newFixedThreadPool(2);

        System.out.println("Iniciando a fábrica...");
        executor.submit(new Produtor(filaPedidos));
        executor.submit(new Consumidor(filaPedidos));

        // Desliga o executor de forma graciosa na thread principal
        executor.shutdown();
    }
}
