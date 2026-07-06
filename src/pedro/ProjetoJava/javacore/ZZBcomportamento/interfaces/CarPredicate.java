package pedro.ProjetoJava.javacore.ZZBcomportamento.interfaces;

import pedro.ProjetoJava.javacore.ZZBcomportamento.dominios.Carro;

public interface CarPredicate {
    boolean test(Carro car); // retorna true ou false
}
