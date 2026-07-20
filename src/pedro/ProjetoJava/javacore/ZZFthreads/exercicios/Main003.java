package pedro.ProjetoJava.javacore.ZZFthreads.exercicios;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main003 {

    public static void main(String[] args) {
        // Criando um servidor com capacidade para atender 3 requisições simultâneas
        ExecutorService servidor = Executors.newFixedThreadPool(3);

        System.out.println("Servidor iniciado. Recebendo 20 requisições...");

        for (int i = 1; i <= 20; i++) {
            final int numeroRequisicao = i;

            servidor.submit(() -> {
                String nomeThread = Thread.currentThread().getName();
                System.out.println("[INÍCIO] " + nomeThread + " processando requisição " + numeroRequisicao);

                simularLentidao(2000); // Simula uma tarefa pesada de 2 segundos

                System.out.println("[FIM] " + nomeThread + " finalizou requisição " + numeroRequisicao);
            });
        }

        // Avisa que não vamos aceitar novas tarefas, mas deixa as atuais terminarem
        servidor.shutdown();
    }

    private static void simularLentidao(int ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { }
    }
}
