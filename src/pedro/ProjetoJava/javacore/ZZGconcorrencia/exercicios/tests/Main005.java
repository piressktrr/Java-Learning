package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 1. Interface que define um listener
interface EventListener {
    void onEvent(String event);
}

// 2. Classe concreta do Listener apenas para podermos identificar quem recebeu o evento
class ClienteListener implements EventListener {
    private final String nome;

    public ClienteListener(String nome) {
        this.nome = nome;
    }

    @Override
    public void onEvent(String event) {
        System.out.println("[" + nome + "] processou: " + event);
    }
}

// 3. O nosso EventBus
class EventBus {
    // A MÁGICA ACONTECE AQUI: Usamos CopyOnWriteArrayList em vez de ArrayList
    private final List<EventListener> listeners = new CopyOnWriteArrayList<>();

    public void register(EventListener listener) {
        listeners.add(listener);
        System.out.println(">>> Listener registrado.");
    }

    public void unregister(EventListener listener) {
        listeners.remove(listener);
        System.out.println("<<< Listener removido.");
    }

    public void publish(String event) {
        System.out.println("\n--- Publicando evento: " + event + " ---");
        // Esta iteração é segura. Não lançará ConcurrentModificationException
        // mesmo se a thread modificadora chamar register/unregister durante o loop.
        for (EventListener listener : listeners) {
            listener.onEvent(event);

            // Pausa artificial só para dar tempo da outra thread modificar a lista
            // no meio da nossa iteração (simulando um processamento demorado)
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
    }
}

// 4. Classe Principal para testar
public class Main005 {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new ClienteListener("Listener Fixo"));

        // Cria um "pool" (piscina) com 2 threads prontas para uso
        // O try-with-resources (Java 19+) ou o shutdown() garante que as threads sejam encerradas.
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submetemos a tarefa de leitura
        executor.submit(() -> {
            for (int i = 1; i <= 5; i++) {
                eventBus.publish("Evento " + i);
                try { Thread.sleep(400); } catch (InterruptedException e) {}
            }
        });

        // Submetemos a tarefa de escrita
        executor.submit(() -> {
            for (int i = 1; i <= 3; i++) {
                try { Thread.sleep(200); } catch (InterruptedException e) {}

                ClienteListener listenerTemporario = new ClienteListener("Temporário " + i);
                eventBus.register(listenerTemporario);

                try { Thread.sleep(500); } catch (InterruptedException e) {}
                eventBus.unregister(listenerTemporario);
            }
        });

        // Informa ao executor que não vamos enviar mais tarefas,
        // e ele pode desligar as threads assim que finalizarem.
        executor.shutdown();
    }
}