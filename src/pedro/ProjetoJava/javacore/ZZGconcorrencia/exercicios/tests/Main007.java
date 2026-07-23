package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Tarefa implements Runnable {
    // Melhor prática: atributos privados e imutáveis
    private final String email;

    public Tarefa(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void run() {
        System.out.println("-> Iniciando envio para " + getEmail() + " na " + Thread.currentThread().getName());
        try {
            // Simulando o tempo de envio do e-mail
            Thread.sleep(9000);
            System.out.println("<- Email enviado com sucesso para: " + getEmail());
        } catch (InterruptedException e) {
            // Quando shutdownNow() é chamado, ele "acorda" a thread gerando essa exceção.
            // A boa prática é restaurar o status de interrupção da thread.
            System.err.println("Envio cancelado/interrompido para: " + getEmail());
            Thread.currentThread().interrupt();
        }
    }
}

public class Main007 {
    public static void main(String[] args) throws InterruptedException {
        // Pool com 5 threads (todas as nossas 4 tarefas rodarão ao mesmo tempo)
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.execute(new Tarefa("exemplo1@gmail.com"));
        executorService.execute(new Tarefa("exemplo2@gmail.com"));
        executorService.execute(new Tarefa("exemplo3@gmail.com"));
        executorService.execute(new Tarefa("exemplo4@gmail.com"));

        // 1. Inicia o desligamento suave (Recusa novas tarefas)
        executorService.shutdown();

        try {
            // 2. Aguarda até 5 segundos para que as tarefas em andamento terminem
            System.out.println("Aguardando finalização das tarefas...");
            boolean terminaramNoTempo = executorService.awaitTermination(5, TimeUnit.SECONDS);

            if (!terminaramNoTempo) {
                // 3. Se estourou o tempo de 5 segundos, força a parada das tarefas
                System.out.println("Tempo limite atingido. Forçando encerramento!");
                executorService.shutdownNow();
            } else {
                System.out.println("Todas as tarefas foram concluídas com sucesso.");
            }
        } catch (InterruptedException e) {
            // Caso a própria thread principal (main) seja interrompida enquanto aguarda
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
