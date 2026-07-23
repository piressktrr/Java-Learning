package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

class Pedido1 {
    private int id;
    private String descricao;
    private double preco;

    public Pedido1(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    @Override
    public String toString() {
        return String.format("Pedido{id=%d, descricao='%s', preco=R$%.2f}", id, descricao, preco);
    }
}

class Pipeline {
    // Etapa 1: Valida e repassa o pedido
    public Pedido1 validar(Pedido1 pedido) {
        System.out.println("1. Validando pedido... " + Thread.currentThread().getName());
        if (pedido.getId() <= 0 || pedido.getDescricao().isEmpty()) {
            throw new IllegalArgumentException("Pedido inválido!");
        }
        simularAtraso(500);
        return pedido;
    }

    // Etapa 2: Calcula, atualiza o pedido e repassa
    public Pedido1 calcularPreco(Pedido1 pedido) {
        System.out.println("2. Calculando preço... " + Thread.currentThread().getName());
        double precoBase = ThreadLocalRandom.current().nextInt(100, 200);
        pedido.setPreco(precoBase);
        simularAtraso(500);
        return pedido;
    }

    // Etapa 3: Simula uma chamada assíncrona externa (ex: API de cupons)
    // Retorna um CompletableFuture para podermos usar o thenCompose!
    public CompletableFuture<Pedido1> aplicarDescontoAsync(Pedido1 pedido) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("3. Aplicando desconto em sistema externo... " + Thread.currentThread().getName());
            double desconto = ThreadLocalRandom.current().nextDouble(1, 15);
            pedido.setPreco(pedido.getPreco() - desconto);
            simularAtraso(1000);
            return pedido;
        });
    }

    // Etapa 4: Finaliza (não retorna nada)
    public void confirmar(Pedido1 pedido) {
        System.out.println("4. ✅ Pedido Confirmado! " + pedido);
    }

    private void simularAtraso(int ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) {}
    }
}

public class Main010 {
    public static void main(String[] args) {
        Pipeline pipeline = new Pipeline();
        Pedido1 meuPedido = new Pedido1(1, "Notebook");

        System.out.println("--- Iniciando Pipeline Assíncrono ---");

        // A MÁGICA DA ESTEIRA:
        CompletableFuture<Void> esteira = CompletableFuture
                // Dá a partida numa thread separada
                .supplyAsync(() -> pipeline.validar(meuPedido))

                // thenApply: Transforma (recebe Pedido, devolve Pedido)
                .thenApply(pipeline::calcularPreco)

                // thenCompose: Achata futuros (recebe Pedido, devolve CompletableFuture<Pedido>)
                .thenCompose(pipeline::aplicarDescontoAsync)

                // thenAccept: Consome o resultado (recebe Pedido, não devolve nada)
                .thenAccept(pipeline::confirmar);

        System.out.println("[Main] A esteira está rodando em background. Eu (Main) estou livre para fazer outras coisas!");

        // Trava a thread main APENAS para o programa não encerrar antes da esteira terminar
        esteira.join();
    }
}
