package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import java.util.concurrent.*;

class Fornecedor implements Callable<String>{
    private final String nome;
    private final int tempoDeRespostaMs;

    public Fornecedor(String nome, int tempoDeRespostaMs) {
        this.nome = nome;
        this.tempoDeRespostaMs = tempoDeRespostaMs;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(tempoDeRespostaMs); // Simula o tempo de busca na API
        return "Dados recebidos do " + nome;
    }
}

public class Main009 {
    public static void main(String[] args) {
        // Pool com 3 threads para buscar nos 3 fornecedores simultaneamente
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Criando fornecedores com tempos de resposta diferentes
        Fornecedor f1 = new Fornecedor("Fornecedor A", 1000); // 1 segundo
        Fornecedor f2 = new Fornecedor("Fornecedor B", 1500); // 1.5 segundos
        Fornecedor f3 = new Fornecedor("Fornecedor C (Lento)", 3000); // 3 segundos

        // Submetemos as tarefas em paralelo. Recebemos os "recibos" (Futures)
        System.out.println("Enviando requisições em paralelo...");
        Future<String> future1 = executor.submit(f1);
        Future<String> future2 = executor.submit(f2);
        Future<String> future3 = executor.submit(f3);

        // Agora vamos tentar pegar os resultados com um limite de tempo (Timeout)
        System.out.println("Aguardando as respostas (Máximo 2 segundos)...");

        pegarResultadoComTimeout(future1, "Fornecedor A");
        pegarResultadoComTimeout(future2, "Fornecedor B");
        pegarResultadoComTimeout(future3, "Fornecedor C"); // Este vai estourar o timeout!

        // Não se esqueça de desligar o executor
        executor.shutdown();
    }

    // Método auxiliar apenas para tratar as exceções e não poluir o main
    private static void pegarResultadoComTimeout(Future<String> future, String nomeForncedor) {
        try {
            // O segredo do exercício está aqui! Espera no máximo 2 segundos.
            String resultado = future.get(2, TimeUnit.SECONDS);
            System.out.println("[SUCESSO] " + resultado);

        } catch (TimeoutException e) {
            System.err.println("[FALHA] " + nomeForncedor + " demorou demais! Timeout atingido.");
            future.cancel(true); // Boa prática: cancela a tarefa que demorou demais
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("[ERRO] Erro ao processar " + nomeForncedor);
        }
    }
}
