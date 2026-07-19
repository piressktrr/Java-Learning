package pedro.ProjetoJava.javacore.ZZFthreads.dominios;

import java.util.concurrent.atomic.AtomicInteger;

public class Servico {
    private final AtomicInteger estoque = new AtomicInteger(1);

    public synchronized void comprar(Produto produto){
        this.estoque.getAndUpdate(e -> Math.max(0, e - produto.getQuantidade()));
    }
}
