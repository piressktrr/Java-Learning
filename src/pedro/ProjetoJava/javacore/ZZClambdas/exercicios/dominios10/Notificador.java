package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios10;

import java.util.function.Consumer;

public class Notificador <T> {
    private final Consumer<T> consumer;

    public Notificador(Consumer<T> consumer) {
        this.consumer = consumer;
    }

    public void notificar(T evento) {
        consumer.accept(evento);
    }

    public static <T extends Comparable<T>> T maior (T a, T b) {
        return a.compareTo(b) > 0 ? a : b;

    }

}
