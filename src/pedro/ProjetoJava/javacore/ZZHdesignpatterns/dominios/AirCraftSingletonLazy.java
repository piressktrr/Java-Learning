package pedro.ProjetoJava.javacore.ZZHdesignpatterns.dominios;

import java.util.HashSet;

public class AirCraftSingletonLazy {
    private String nome;
    private HashSet<String> assentos = new HashSet<>();
    {
        assentos.add("1A");
        assentos.add("1B");
    }
    private static AirCraftSingletonLazy airCraftSingletonLazy;

    public static AirCraftSingletonLazy getAirCraftSingletonLazy() {
        if (airCraftSingletonLazy == null) {
            synchronized (AirCraftSingletonLazy.class) {
                if (airCraftSingletonLazy == null) {
                    airCraftSingletonLazy = new AirCraftSingletonLazy("320BUS");
                }
            }
        }
        return airCraftSingletonLazy;
    }

    public boolean assento(String assento) {
        return assentos.remove(assento);
    }

    private AirCraftSingletonLazy(String nome) {
        this.nome = nome;
    }


}
