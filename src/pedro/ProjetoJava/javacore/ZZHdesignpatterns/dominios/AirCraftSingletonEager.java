package pedro.ProjetoJava.javacore.ZZHdesignpatterns.dominios;

import java.util.HashSet;

public class AirCraftSingletonEager {
    private String nome;
    private HashSet<String> assentos = new HashSet<>();
    {
        assentos.add("1A");
        assentos.add("1B");
    }
    private static final AirCraftSingletonEager airCraftSingletonEager = new AirCraftSingletonEager("750BUS");

    public static AirCraftSingletonEager getAirCraftSingletonEager() {
        return airCraftSingletonEager;
    }

    public boolean assento(String assento) {
        return assentos.remove(assento);
    }

    private AirCraftSingletonEager(String nome) {
        this.nome = nome;
    }


}
