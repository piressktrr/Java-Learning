    package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

    import java.util.concurrent.CompletableFuture;
    import java.util.concurrent.ThreadLocalRandom;

    class Pipeline{
    public boolean validar(Pedido pedido) {
        if ((pedido.getId() > 0) && (!pedido.getDescriçao().isEmpty())) {
            return true;
        }
        return false;
    }

    public double calcularPreco () {
        return ThreadLocalRandom.current().nextInt(1, 200);
    }

    public double aplicarDesconto() {
        return ThreadLocalRandom.current().nextDouble(1, 15) / 2;
    }

    public void confirmar(Pedido pedido) {
        if (validar(pedido)) {
            double p = calcularPreco();
            double d = aplicarDesconto();
        }


    }
}

public class Main010 {
    public static void main(String[] args) {
        Pipeline  p = new Pipeline();



    }
}
