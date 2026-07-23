package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main008 {
    public static void main(String[] args) {
        System.out.println("--- TESTANDO FIXED DELAY ---");
        testarAgendamento(true);

        // Dica: Para testar o Fixed Rate, troque o 'true' acima para 'false'
        // testarAgendamento(false);
    }

    public static void testarAgendamento(boolean usarFixedDelay) {
        // Pool com apenas 1 thread é o suficiente para este teste
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        Runnable task = () -> {
            System.out.println("[" + LocalTime.now().format(formatter) + "] Iniciando geração do relatório...");
            try {
                // Simula que o relatório demora 2 segundos para ser gerado
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Tarefa interrompida!");
                Thread.currentThread().interrupt();
            }
            System.out.println("[" + LocalTime.now().format(formatter) + "] Relatório concluído!");
        };

        ScheduledFuture<?> agendamento;

        if (usarFixedDelay) {
            // FIXED DELAY: Espera 3 segundos APÓS o término da tarefa anterior
            // Fluxo: Inicia (0s) -> Demora (2s) -> Termina -> Espera Delay (3s) -> Próximo inicia no segundo 5.
            agendamento = executor.scheduleWithFixedDelay(task, 0, 3, TimeUnit.SECONDS);
        } else {
            // FIXED RATE: Inicia a cada 3 segundos, independentemente do término.
            // Fluxo: Inicia (0s) -> Demora (2s) -> Termina -> Falta 1s para o rate -> Próximo inicia no segundo 3.
            agendamento = executor.scheduleAtFixedRate(task, 0, 3, TimeUnit.SECONDS);
        }

        // Tarefa única (one-shot) que roda após 12 segundos para cancelar tudo
        executor.schedule(() -> {
            System.out.println("\n[SISTEMA] Tempo limite atingido. Cancelando agendamento...");
            agendamento.cancel(false); // Para as repetições
            executor.shutdown();       // Desliga o pool para o programa poder encerrar
        }, 12, TimeUnit.SECONDS);
    }
}
