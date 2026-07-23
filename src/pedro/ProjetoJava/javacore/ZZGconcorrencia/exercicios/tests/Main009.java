package pedro.ProjetoJava.javacore.ZZGconcorrencia.exercicios.tests;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Fornecedor implements Callable<String>{
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "Fornecedor call: " + Thread.currentThread().getName();
    }
}

public class Main009 {
    public static void main(String[] args) throws Exception {
        Fornecedor f1 = new Fornecedor();
        Fornecedor f2 = new Fornecedor();
        Fornecedor f3 = new Fornecedor();

        f1.call();
        f2.call();
        f3.call();


    }
}
